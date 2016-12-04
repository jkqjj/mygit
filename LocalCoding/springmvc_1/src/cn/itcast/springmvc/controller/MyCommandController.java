package cn.itcast.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import cn.itcast.springmvc.domain.Person;
/**
 * 自定义命令控制器
 *
 */
public class MyCommandController extends AbstractCommandController {
	
	/**
	 * 通过构造方法注册命令类
	 */
	public MyCommandController() {
		this.setCommandClass(Person.class);//注册命令类
		this.setCommandName("person");//指定命令名称
	}

	@Override
	protected ModelAndView handle(HttpServletRequest req,
			HttpServletResponse resp, Object o, BindException arg3)
			throws Exception {
		
		Person p = (Person)o;
		System.out.println(p);
		return new ModelAndView("command");
	}

}
