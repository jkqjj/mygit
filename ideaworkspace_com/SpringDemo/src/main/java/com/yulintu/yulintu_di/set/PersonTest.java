package com.yulintu.yulintu_di.set;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by qianjiajia on 2016/11/25.
 */
public class PersonTest extends SpringHelper{
    static {
        path = "applicationContextDI.xml";
    }

    @Test
    public void test(){
        Person person = (Person)context.getBean("person");
        person.getStudent().say();
        System.out.println(person.getPid());
        System.out.println(person.getPname());
        List lists = person.getLists();
        for (int i = 0;i < lists.size();i++){
            System.out.println(lists.get(i).toString());
        }
        Set sets = person.getSets();
        for (int i = 0;i < sets.size();i++){
            System.out.println(sets.toString());
        }
    }
}
