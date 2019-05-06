package base.sybsyntax;

/**
 * @author Dong
 * <p>
 * interface Name : SqlSupport
 * Create Time : 18:57
 * Create Date : 2019/5/6
 * Project : JDBCHelper
 * <p>
 * 本接口为所有语法支持的基础类，本
 * 接口中提供了语法生成的基础，所有
 * 语法必须符合相应的数据库语法支持
 */

public interface SqlSupport {

    /**
     * 必须提供基本的返回字符串的操作
     *
     * @return 返回一个标准的Sql语句
     */
    @Override
    abstract public String toString();
}
