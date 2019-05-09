package invokeSupport;

import exceptions.DataFormatException;

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

    /**
     * 将传入的get或set方法名转换为该属性
     * <p>
     * setName 传入后将返回 name
     *
     * @param methodName setter或getter方法
     * @return 返回该属性值
     * @throws DataFormatException 该方法不是set或get方法，或者不可转换的方法
     */
    public static String getPropertyFromGetOrSetMethod(String methodName) throws DataFormatException {
        boolean isStartWithSetOrGet = methodName.startsWith("set") || methodName.startsWith("get");
        int baseSize = 3;
        if (!isStartWithSetOrGet) {
            throw new DataFormatException("传入方法不是getter或setter方法");
        }
        if(methodName.length() < baseSize){
            throw new DataFormatException("传入方法长度不正常");
        }
        char [] letters = methodName.toCharArray();
        StringBuilder result = new StringBuilder();
        if(letters[3] >= 'a' && letters[3] <= 'z'){
            letters[3] = (char)(letters[3] - 'a' + 'A');
        }
        for(int i = 3; i < letters.length; i++){
            result.append(letters[i]);
        }
        return result.toString();
    }
}
