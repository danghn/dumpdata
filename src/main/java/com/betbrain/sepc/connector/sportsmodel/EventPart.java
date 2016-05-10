package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EventPart extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_parentId = "parentId";
    public static final String PROPERTY_NAME_orderNum = "orderNum";
    public static final String PROPERTY_NAME_isDrawPossible = "isDrawPossible";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _description;
    private Long _parentId;
    private int _orderNum;
    private Boolean _isDrawPossible;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventPart() {

    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    @Override
    public String getName() {

        return _name;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setName(String name) {

        _name = name;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getDescription() {

        return _description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setDescription(String description) {

        _description = description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParentId() {

        return _parentId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setParentId(Long parentId) {

        _parentId = parentId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public int getOrderNum() {

        return _orderNum;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setOrderNum(int orderNum) {

        _orderNum = orderNum;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getIsDrawPossible() {

        return _isDrawPossible;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setIsDrawPossible(Boolean isDrawPossible) {

        _isDrawPossible = isDrawPossible;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
