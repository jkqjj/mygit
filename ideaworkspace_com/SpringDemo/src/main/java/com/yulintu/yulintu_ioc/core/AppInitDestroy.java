package com.yulintu.yulintu_ioc.core;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qianjiajia on 2016/11/24.
 */
public class AppInitDestroy extends SpringHelper{

    static {
        path = "applicationContext.xml";
    }

    @Test
    public void test(){

        ClassPathXmlApplicationContext applicationContext = (ClassPathXmlApplicationContext)context;
        HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
        helloWorld.printHello();
        applicationContext.close();
    }
}
