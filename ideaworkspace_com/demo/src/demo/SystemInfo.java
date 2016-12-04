package demo;

import java.util.Enumeration;
import java.util.Properties;
import java.util.StringJoiner;

/**
 * Created by qianjiajia on 2016/11/4.
 */
public class SystemInfo {

    public static void main(String[] args){

        Properties sp = System.getProperties();
        Enumeration e = sp.propertyNames();
        while (e.hasMoreElements()){

            String key = (String)e.nextElement();
            System.out.println(key+"="+sp.getProperty(key));
        }

    }
}
