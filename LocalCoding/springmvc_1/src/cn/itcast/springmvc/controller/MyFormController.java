package cn.itcast.springmvc.controller;

import org.springframework.web.servlet.mvc.SimpleFormController;

import cn.itcast.springmvc.domain.Person;
/**
 * 自定义表单控制器
 *
 */
public class MyFormController extends SimpleFormController {
	
	/**
	 * 通过构造方法注册命令类
	 */
	public MyFormController() {
		this.setCommandClass(Person.class);//注册命令类
		this.setCommandName("person");//指定命令名称
	}

	/**
	 * 当提交表单时会调用此方法
	 */
	protected void doSubmitAction(Object command) throws Exception {
		Person p = (Person)command;
		System.out.println("doSubmitAction-----person:" + p);
		super.doSubmitAction(command);
	}

}
