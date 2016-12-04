package com.yulintu.yulintu_ioc.core;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;

/**
 * Created by qianjiajia on 2016/11/24.
 */

/**
 * 无论这两个类之间有什么继承关系，静态代码块比方法先执行
 */
public class AppTest extends SpringHelper{
    static {
        path = "applicationContext.xml";
    }
    @Test
    public void test(){



        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getLists().add("aa");
        helloWorld.printHello();

        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        helloWorld2.getLists().add("bb");
        helloWorld2.printHello();

        System.out.println(helloWorld.getLists().size());
        System.out.println(helloWorld2.getLists().size());





    }
}
