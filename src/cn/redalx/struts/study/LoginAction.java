package cn.redalx.struts.study;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
    public String execute() throws Exception {
    	System.out.println("execute");
    	return "success";
    }
    public String check(){
    	System.out.println("check123");
    	return SUCCESS;
    }
}
