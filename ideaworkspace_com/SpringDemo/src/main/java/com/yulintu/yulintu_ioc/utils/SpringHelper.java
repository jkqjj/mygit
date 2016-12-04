package com.yulintu.yulintu_ioc.utils;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qianjiajia on 2016/11/24.
 */
public class SpringHelper {
    public static ApplicationContext context;
    public static String path;

    @Before
    public void startSpring(){
        context = new ClassPathXmlApplicationContext(path);
    }
}
