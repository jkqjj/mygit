package com.yulintu.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by qianjiajia on 2016/11/28.
 */
public class HomeController extends AbstractController{

    String name;

    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("HomeController-----------"+req.getParameter("name"));
        req.setAttribute("msg","hello"+req.getParameter("name"));
        return new ModelAndView("home");//home为逻辑名
    }
}
