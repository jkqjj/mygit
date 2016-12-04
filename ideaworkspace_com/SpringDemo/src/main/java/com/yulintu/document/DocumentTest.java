package com.yulintu.document;

import com.yulintu.yulintu_ioc.utils.SpringHelper;
import org.junit.Test;

/**
 * Created by qianjiajia on 2016/11/25.
 */
//public class DocumentTest {
//    @Test
//    public void test(){
//        /**
//         * 没有做到完全的面向接口编程
//         */
//        //Document document = new WordDocument();
//        //DocumentManager documentManager = new DocumentManager(document);
//        //documentManager.read();
//        //documentManager.write();
//
//
//    }
//}

public class DocumentTest extends SpringHelper{
    static {
        path = "applicationContextDocument.xml";
    }

    @Test
    public void test(){
        DocumentManager documentManager = (DocumentManager)context.getBean("documentManager");
        documentManager.read();
        documentManager.write();
    }
}