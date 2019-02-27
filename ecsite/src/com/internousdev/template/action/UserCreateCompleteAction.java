package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object>session;
	private UserCreateCompleteDAO uccdao=new UserCreateCompleteDAO();

	public String execute()throws SQLException{
	uccdao.createuser(session.get("loginUserId").toString(),
			          session.get("loginPassword").toString(),
			          session.get("userName").toString());
	String result=SUCCESS;

	return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserid(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUsername(){
		return userName;
	}
	public void setUsername(String userName){
		this.userName=userName;
	}

	@Override
	public void setSession(Map<String,Object>session ){
		this.session=session;
	}

}
