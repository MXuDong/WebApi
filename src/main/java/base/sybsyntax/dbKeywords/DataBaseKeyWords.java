package base.sybsyntax.dbKeywords;

/**
 * 所有语法支持的父类
 */
public enum DataBaseKeyWords {

    /**
     * None : 占位符
     * 不包含任何信息
     */
    None("");

    /**
     * 每一个枚举元素具有的值
     */
    private String value;

    DataBaseKeyWords(String keyWordValue) {
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
    public String getValueWithPostSpace(){
        return " " + this.value;
    }

    /**
     * 获取关键字，并在关键字前后添各加一个空格
     *
     * @return （空格+关键字+空格） 的字符串
     */
    public String getValueWithDoubleSpace(){
        return " " + this.value + " ";
    }

    /**
     * 获取关键字，并在关键字不包含空格 等价于getValue()
     *
     * @return （关键字） 的字符串
     */
    public String getValueWithoutSpace(){
        return this.value;
    }
}
