package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object>session;
	private LoginDAO dao=new LoginDAO();
	private LoginDTO dto=new LoginDTO();

	public String execute(){
		String result =ERROR;
		dto=dao.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser",dto);
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;;
		}


		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session ){
		this.session = session;
	}

}
