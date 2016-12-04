package com.yulintu.annotation;

/**
 * Created by qianjiajia on 2016/11/25.
 */

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 注解解析器
 */
public class AnnotationParse {
    public static void parse(){
        Class classst = ITCAST.class;
        /**
         * 类上的注解
         */
        if (classst.isAnnotationPresent(Name.class)){
            Name name = (Name)classst.getAnnotation(Name.class);
            System.out.println(name.value());
        }

        /**
         * 获取方法上的注解
         */
        Method[] methods = classst.getMethods();
        for (Method method:methods){
            if (method.isAnnotationPresent(Description.class)){
                Description description = (Description) method.getAnnotation(Description.class);
                System.out.println(description.value());
            }
        }
    }

    @Test
    public void test(){
        AnnotationParse.parse();
    }
}
