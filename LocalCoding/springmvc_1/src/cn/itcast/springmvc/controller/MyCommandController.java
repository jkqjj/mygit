package cn.itcast.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import cn.itcast.springmvc.domain.Person;
/**
 * �Զ������������
 *
 */
public class MyCommandController extends AbstractCommandController {
	
	/**
	 * ͨ�����췽��ע��������
	 */
	public MyCommandController() {
		this.setCommandClass(Person.class);//ע��������
		this.setCommandName("person");//ָ����������
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
