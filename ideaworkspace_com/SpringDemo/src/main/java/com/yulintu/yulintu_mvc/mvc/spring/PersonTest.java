package com.yulintu.yulintu_mvc.mvc.spring;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;

/**
 * Created by qianjiajia on 2016/11/25.
 */
public class PersonTest extends SpringHelper {
    static {
        path = "applicationContextMVCspring.xml";
    }

    @Test
    public void test(){
        PersonAction personAction = (PersonAction)context.getBean("personAction");
        personAction.savePerson();
    }
}
