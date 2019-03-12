package com.internousdev.template.dto;


public class LoginDTO {
	private String loginId ;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;

//	追記
	private String adminFlg;

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginId = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(Boolean loginFlg ){
		this.loginFlg = loginFlg;
	}

//	追記
	public String getAdminFlg(){
		return adminFlg;
	}

	public void setAdminFlg(String adminFlg){
		this.adminFlg=adminFlg;
	}

}
