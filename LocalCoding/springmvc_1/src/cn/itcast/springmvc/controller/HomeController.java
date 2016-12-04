package cn.itcast.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController {
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		System.out.println("HomeController-------" + req.getParameter("name"));
		
		//req.setAttribute("msg", "hello " + req.getParameter("name"));
		return new ModelAndView("home","msg","hello " + req.getParameter("name"));//homeÎªÂß¼­Ãû
	}

}
