package base.sybsyntax.dbKeywords;

public enum MySqlKeyWords {

    /**
     * MySql 的支持语句
     * <p>
     * 基本语句生成：
     * Select:
     * SELECT
     * [COUNT(*), *, column]
     * FROM [tableName]
     * {WHERE [term]}
     * {ORDER BY [column] [DESC, ASC]}
     * {LIMIT ?, ?}
     *
     * update:
     * UPDATE [tableName]
     * SET term
     * {WHERE term}
     *
     * insert:
     * INSERT INTO [tableName] (?....?) VALUES (?....?)
     *
     */
    SELECT("SELECT"),
    UPDATE("UPDATE"),
    INSERT("INSERT"),
    DELETE("DELETE"),

    FROM("FROM"),
    INTO("INTO"),

    WHERE("WHERE"),
    SET("SET"),
    VALUES("VALUES"),

    ORDER_BY("ORDER BY"),
    DESC("DESC"),
    ASC("ASC"),

    LIMIT("LIMIT"),

    AND("AND");

    /**
     * 每一个枚举元素具有的值
     */
    private String value;

    MySqlKeyWords(String keyWordValue) {
        this.value = keyWordValue;
    }

    /**
     * 获取关键字，并在关键字前添加一个空格
     *
     * @return （空格+关键字） 的字符串
     */
    public String getValueWithPreSpace() {
        return " " + this.value;
    }

    /**
     * 获取关键字，并在关键字后添加一个空格
     *
     * @return （空格+关键字+空格） 的字符串
     */
    public String getValueWithPostSpace() {
        return " " + this.value;
    }

    /**
     * 获取关键字，并在关键字前后添各加一个空格
     *
     * @return （空格+关键字+空格） 的字符串
     */
    public String getValueWithDoubleSpace() {
        return " " + this.value + " ";
    }

    /**
     * 获取关键字，并在关键字不包含空格 等价于getValue()
     *
     * @return （关键字） 的字符串
     */
    public String getValueWithoutSpace() {
        return this.value;
    }
}
