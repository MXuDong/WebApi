package entitySupport;

import invokeSupport.DataUtil;

import java.util.Map;

/**
 * @author Dong
 * <p>
 * Class Name : BaseEntity
 * Create Time : 18:29
 * Create Date : 2019/5/6
 * Project : JDBCHelper
 * <p>
 * all of the entity must extend this class.
 * <p>
 * And you must make sure that the entity has
 * no basic requirements, but you can use
 * package class like Integer.
 */

public abstract class BaseEntity {

    /**
     * This table's primary keys
     */
    private String[] primaryKeys;

    public String[] getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(String[] primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public String getTableName() {
        return DataUtil.getClassName(this);
    }

    /**
     * To get all params of this entity, and
     * this method must be override, and make
     * sure that the result can be read by database.
     * <p>
     * To this method, the package{invokeSupport} is
     * support some method for you do something.
     * Just like to create a Map of the key mapper.
     * <p>
     * For example,
     * the result must are string:
     * <p>
     * Table has a field : user_name
     * And the entity has a property : userName
     * <p>
     * the result is contain this key and values:
     * {userName:user_name}
     *
     * @return the mapper result
     */
    abstract public Map<String, String> getAllKeyMapper();

    /**
     * This method must be override, and you can
     * do something in this method, and you can
     * create result which you want.
     * <p>
     * For example:
     * this entity has property:
     * String userName;
     * Integer userAge;
     * <p>
     * the userName is null;
     * the userAge is 26
     * <p>
     * the result is {userAge:26}
     *
     * @return the not null property map.
     */
    abstract public Map<String, Object> getNotNullProperty();
}
