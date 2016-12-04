package cn.itcast.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import cn.itcast.springmvc.domain.Person;
/**
 * 向导表单控制器
 *
 */
public class MyWizardFormController extends AbstractWizardFormController {
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractWizardFormController#processCancel(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.validation.BindException)
	 */
	@Override
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("index");
	}

	public MyWizardFormController() {
		this.setCommandClass(Person.class);
		this.setCommandName("person");
	}

	@Override
	protected ModelAndView processFinish(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		System.out.println("processFinish-----");
		return new ModelAndView("success");
	}

}
