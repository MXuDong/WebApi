package invokeSupport;

/**
 * @author Dong
 * <p>
 * Class Name : DataUtil
 * Create Time : 10:11
 * Create Date : 2019/5/9
 * Project : JDBCHelper
 * <p>
 * 数据转换支持
 */

public class DataUtil {

    /**
     * 获取Entity 类的名字
     * 只获取类名，而不是全限定名，即不包括包名
     *
     * @param o 被获取类名的类
     * @return 类的名称
     */
    public static String getClassName(Object o) {
        String[] packages = o.getClass().getName().split("\\.");
        return packages[packages.length - 1];
    }
}
