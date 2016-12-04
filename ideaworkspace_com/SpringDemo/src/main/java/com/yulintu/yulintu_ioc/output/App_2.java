package com.yulintu.yulintu_ioc.output;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class App_2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-Common.xml"});

        OutputHelper outputHelper = (OutputHelper)context.getBean("OutputHelper");
        outputHelper.generateOutout();
    }
}
