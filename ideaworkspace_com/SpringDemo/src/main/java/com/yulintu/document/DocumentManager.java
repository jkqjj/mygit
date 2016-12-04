package com.yulintu.document;

/**
 * Created by qianjiajia on 2016/11/25.
 */

/**
 * 利用spring的ioc和di做到了完全的面向接口编程
 *
 */
public class DocumentManager {
    private Document document;

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void read(){
        this.document.read();
    }

    public void write(){
        this.document.write();
    }
}
