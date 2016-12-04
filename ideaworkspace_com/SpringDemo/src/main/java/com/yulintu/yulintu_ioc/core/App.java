package com.yulintu.yulintu_ioc.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class App {
    public static void main(String[] args) {
        /**
         * 启动spring容器
         * 从spring容器中把对象拿出来
         * 对象.方法
         */
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
