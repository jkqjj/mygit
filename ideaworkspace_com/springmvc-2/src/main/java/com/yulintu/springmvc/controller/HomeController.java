package com.yulintu.springmvc.controller;

import com.yulintu.springmvc.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by qianjiajia on 2016/11/28.
 */
@Controller
@RequestMapping(value = "/home")//根路径
public class HomeController {

    @RequestMapping(value="/a",method= RequestMethod.GET)//子路径
    public String method1(@RequestParam(value="id") String uid, String name, String address, Person p, HttpServletRequest req, Map<String,String> model){
        //uid = req.getParameter("id");
        System.out.println("---------method1---------id=" + uid + " name=" + name + " address=" + address);
        System.out.println("person:" + p);

        req.setAttribute("msg", "hello world");
        model.put("key","value");
        return "home";//逻辑名
    }

    @RequestMapping(value="/b")
    public String method2(){
        return "";
    }
}
