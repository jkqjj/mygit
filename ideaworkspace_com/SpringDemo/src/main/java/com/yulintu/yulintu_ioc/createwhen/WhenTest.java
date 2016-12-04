package com.yulintu.yulintu_ioc.createwhen;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;

/**
 * Created by qianjiajia on 2016/11/24.
 */
public class WhenTest extends SpringHelper {
    static {
        path = "applicationContext.xml";
    }
    @Test
    public void test(){

        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        Person person = (Person) context.getBean("person");
        helloWorld.printHello();
        person.say();
    }
}
