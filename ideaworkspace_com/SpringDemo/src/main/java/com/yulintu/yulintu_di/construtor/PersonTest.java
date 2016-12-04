package com.yulintu.yulintu_di.construtor;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;

/**
 * Created by qianjiajia on 2016/11/25.
 */
public class PersonTest extends SpringHelper {
    static {
        path = "applicationContextDIConstrutor.xml";
    }

    @Test
    public void test(){
        Person person = (Person)context.getBean("person");
        //System.out.println(person.getPid());
        //System.out.println(person.getPname());
        person.getStudent().say();

    }
}
