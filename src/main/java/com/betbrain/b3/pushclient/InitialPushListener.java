package com.betbrain.b3.pushclient;

import java.lang.reflect.Field;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import com.betbrain.sepc.connector.sdql.EntityChangeBatchProcessingMonitor;
import com.betbrain.sepc.connector.sdql.SEPCConnector;
import com.betbrain.sepc.connector.sdql.SEPCConnectorListener;
import com.betbrain.sepc.connector.sdql.SEPCPushConnector;
import com.betbrain.sepc.connector.sportsmodel.BettingOffer;
import com.betbrain.sepc.connector.sportsmodel.Entity;
import com.betbrain.sepc.connector.sportsmodel.EntityChange;
import com.betbrain.sepc.connector.sportsmodel.EntityChangeBatch;
import com.betbrain.sepc.connector.sportsmodel.EntityCreate;
import com.betbrain.sepc.connector.sportsmodel.EntityDelete;
import com.betbrain.sepc.connector.sportsmodel.EntityUpdate;
import com.betbrain.sepc.connector.sportsmodel.Outcome;

public class InitialPushListener implements SEPCConnectorListener, EntityChangeBatchProcessingMonitor {
	private static boolean initialDump = true;
	protected final Logger logger = Logger.getLogger(this.getClass());
	private static EntityManager em;
	private long lastBatchId;

	public static void main(String[] args) {
		SEPCConnector pushConnector = new SEPCPushConnector("sept.betbrain.com", 7000);
		pushConnector.addConnectorListener(new InitialPushListener());
		pushConnector.setEntityChangeBatchProcessingMonitor(new BatchMonitor());
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BetBrainService");
		em = emf.createEntityManager();
		pushConnector.start("OddsHistory");
	}

	public void notifyEntityUpdates(EntityChangeBatch changeBatch) {
		// em.getTransaction().begin();
		lastBatchId = changeBatch.getId();
		int i = 0;
		List<EntityChange> entities = changeBatch.getEntityChanges();
		try {
			if (!em.getTransaction().isActive()) {
				em.getTransaction().begin();
			}
			for (EntityChange e : entities) {
				i++;
				if (e instanceof EntityCreate) {
					logger.info("Creating... " + ((EntityCreate) e).getEntity().getDisplayName());
					em.persist(((EntityCreate) e).getEntity());
				} else if (e instanceof EntityUpdate) {
					logger.info("Updating... " + ((EntityUpdate) e).getEntityClass().getName());
					Object object = em.find(((EntityUpdate) e).getEntityClass(), ((EntityUpdate) e).getEntityId());
					set(object, ((EntityUpdate) e).getPropertyNames(), ((EntityUpdate) e).getPropertyValues());
					if (object != null) {
						em.merge(object);
					}
				} else if (e instanceof EntityDelete) {
					logger.info("Deleteing... " + ((EntityDelete) e).getEntityClass().getName());
					Object object = em.find(((EntityDelete) e).getEntityClass(), ((EntityDelete) e).getEntityId());
					if (object != null) {
						em.remove(object);
					}
				}
				if (i % 5000 == 0) {
					logger.info("preparing commit... ");
					em.getTransaction().commit();
					em.clear();
					em.getTransaction().begin();
					logger.info("Processed " + i + " records");
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			em.clear();

		}

	}

	public void notifyInitialDump(List<? extends Entity> entityList) {
		if (initialDump) {
			logger.info("notifyInitialDump ...");

			if (!em.getTransaction().isActive()) {
				em.getTransaction().begin();
			}
			int i = 0;
			for (Entity e : entityList) {
				i++;
				em.persist(e);
				if (i % 10000 == 0) {
					logger.info("preparing saving " + e.getDisplayName() + " ");
					em.getTransaction().commit();
					em.clear();
					em.getTransaction().begin();
					logger.info("Saved " + i + " records");
				}

			}
			em.getTransaction().commit();
			em.clear();
			logger.info("Saved " + i + " records");
			logger.info("notifyInitialDump done.");
			initialDump = false;
		}

	}

	public long getLastAppliedEntityChangeBatchId() {
		return lastBatchId;
	}

	private void set(Object object, List<String> fieldNames, List<Object> fieldValues) {
		if (object != null) {
			Class<?> clazz = object.getClass();
			try {
				int i = 0;
				for (String fieldName : fieldNames) {
					Field field = clazz.getDeclaredField("_" + fieldName);
					field.setAccessible(true);
					field.set(object, fieldValues.get(i));
					i++;
				}

			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}

	}
}
