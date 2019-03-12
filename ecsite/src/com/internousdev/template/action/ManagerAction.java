package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.ManagerLoginDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String adminFlg;
	public Map<String,Object>session;
	private ManagerLoginDAO dao=new ManagerLoginDAO();
	private LoginDTO dto=new LoginDTO();
	private BuyItemDAO bidao=new BuyItemDAO();

	public String execute(){
		String result =ERROR;
		dto=dao.getManagerUserInfo(loginUserId, loginPassword);
		adminFlg=dto.getAdminFlg();
//		,adminFlg
		session.put("loginUser",dto);
		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
			BuyItemDTO bidto=bidao.getBuyItemInfo();
			session.put("login_user_id", dto.getLoginId());
			session.put("id",bidto.getId());
			session.put("buyItem_name",bidto.getItemName());
			session.put("buyItem_price", bidto.getItemPrice());
			if(adminFlg !=null){
			result="manager";
			return result;
			}
			return result;
		}
//		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
//			session.put("admin_Flg", dto.getAdminFlg())
//		if(session.get() !=null){
//			result="manager";
//			return result;
//			}
//		}
//		追記
//		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
//
//		if(!(adminFlg==null)){
//			result="manager";
//			return result;
//		}
//		}

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
//	追記
	public String getAdminFlg(){
		return adminFlg;
	}
	public void setAdminFlg(String adminFlg){
		this.adminFlg=adminFlg;
	}

}
