package com.zhiyou100.struts.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	private String userid;
	private String pwd;
	
	/** 参数校验 */
	public void validate() {
		// 验证非空
		if(userid == null || "".equals(userid.trim()) ){
			// 添加错误信息
			super.addFieldError("userid", "用户名不能为空");
		}
	} 
	
	@Override
	public String execute() throws Exception {
		if("智游".equals(userid) && "123".equals(pwd)) {
			return SUCCESS;
		}else if("zhiyou".equals(userid) && "123".equals(pwd)) {
			super.addFieldError("pwd", "用户名或密码错误");
			return INPUT;
		}
		// 返回跳转路径名称
		return "forward";
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
