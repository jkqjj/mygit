package cn.itcast.springmvc.controller;

import org.springframework.web.servlet.mvc.SimpleFormController;

import cn.itcast.springmvc.domain.Person;
/**
 * �Զ����������
 *
 */
public class MyFormController extends SimpleFormController {
	
	/**
	 * ͨ�����췽��ע��������
	 */
	public MyFormController() {
		this.setCommandClass(Person.class);//ע��������
		this.setCommandName("person");//ָ����������
	}

	/**
	 * ���ύ��ʱ����ô˷���
	 */
	protected void doSubmitAction(Object command) throws Exception {
		Person p = (Person)command;
		System.out.println("doSubmitAction-----person:" + p);
		super.doSubmitAction(command);
	}

}
