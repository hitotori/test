package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.ManagerCreateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String admin_Flg;


	private Map<String,Object>session;
	private ManagerCreateDAO mcdao=new ManagerCreateDAO();

	public String execute()throws SQLException{
	mcdao.createuser(session.get("loginUserId").toString(),
			          session.get("loginPassword").toString(),
			          session.get("userName").toString(),
			          session.get("admin_Flg").toString());

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
	public String getAdmin_Flg() {
		return admin_Flg;
	}
	public void setAdmin_Flg(String admin_Flg) {
		this.admin_Flg = admin_Flg;
	}

	@Override
	public void setSession(Map<String,Object>session ){
		this.session=session;
	}

}