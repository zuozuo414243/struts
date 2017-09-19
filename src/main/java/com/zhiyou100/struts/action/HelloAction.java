package com.zhiyou100.struts.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpServletResponse response = ServletActionContext.getResponse();
//		HttpSession session = request.getSession();
//		ServletContext application = ServletActionContext.getServletContext();
		
		return "test";
	}
}
