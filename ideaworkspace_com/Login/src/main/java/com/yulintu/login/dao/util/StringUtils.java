package com.yulintu.login.dao.util;

/**
 * Created by qianjiajia on 2016/11/14.
 */
public class StringUtils {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        return str == null || "".equals(str) ? true : false;
    }
}
