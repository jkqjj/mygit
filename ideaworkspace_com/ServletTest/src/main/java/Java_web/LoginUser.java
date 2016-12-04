package Java_web;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by qianjiajia on 2016/11/23.
 */
public class LoginUser implements HttpSessionBindingListener {

    private String name;

    public LoginUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("**在session中保存LoginUser对象(name = "+this.getName()+"),session id = "+httpSessionBindingEvent.getSession().getId());
    }

    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("**在session中移除LoginUser对象(name = "+this.getName()+"),session id = "+httpSessionBindingEvent.getSession().getId());

    }
}
