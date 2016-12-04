package com.yulintu.annotation;

import java.lang.annotation.*;

/**
 * Created by qianjiajia on 2016/11/25.
 */

/**
 * @Retention
 * 该注解描述了作用范围
 *        java              ----RetentionPolicy.SOURCE
 *        java+class        ----RetentionPolicy.CLASS
 *        java+class+jvm    ----RetentionPolicy.RUNTIME
 */

/**
 *@Documented
 * 是否在帮助文档中出现
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Description {
    String value();
}
