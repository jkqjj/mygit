package com.yulintu.yulintu_ioc.createobject;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;

/**
 * Created by qianjiajia on 2016/11/24.
 */
public class CreateObjectTest extends SpringHelper {
    static {
        path = "applicationContext.xml";
    }

    /**
     * spring容器调用默认的构造函数来创建对象
     */
    @Test
    public void test(){
        context.getBean("helloWorld");
    }
}
