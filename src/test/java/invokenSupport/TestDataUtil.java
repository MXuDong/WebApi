package invokenSupport;

import invokeSupport.DataUtil;
import org.junit.Test;

/**
 * @author Dong
 * <p>
 * Class Name : TestDataUtil
 * Create Time : 10:15
 * Create Date : 2019/5/9
 * Project : JDBCHelper
 */

public class TestDataUtil {

    @Test
    public void testGetClassName(){
        People people = new People();
        assert "People".equals(DataUtil.getClassName(people));
    }


}

class People{

}