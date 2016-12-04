package com.yulintu.annotation;

import java.lang.annotation.*;

/**
 * Created by qianjiajia on 2016/11/25.
 */

/**
 * 该注解既能在类上也能在方法上。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Name {
    String value() default "";//Name注解有一个属性为value。
    //String value() default "";
}
