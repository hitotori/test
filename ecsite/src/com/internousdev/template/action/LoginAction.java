package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
//	private String adminFlg;
	public Map<String,Object>session;
	private LoginDAO dao=new LoginDAO();
	private LoginDTO dto=new LoginDTO();
	private ArrayList<BuyItemDTO> itemList=new ArrayList<BuyItemDTO>();



	public String execute() throws SQLException{
		String result =ERROR;
		dto=dao.getLoginUserInfo(loginUserId, loginPassword);
//		,adminFlg
		session.put("loginUser",dto);
		while(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			BuyItemDAO bidao=new BuyItemDAO();
			itemList=bidao.getBuyItemInfo();
//			BuyItemDTO bidto=bidao.getBuyItemInfo();
//			BuyItemDTO bidto=new BuyItemDTO();
//			session.put("login_user_id", dto.getLoginId());
//			session.put("id",bidto.getId());
//			session.put("buyItem_name",bidto.getItemName());
//			session.put("buyItem_price", bidto.getItemPrice());
//			itemList.add(bidto);
			session.put("itemList",itemList);
			result=SUCCESS;


//			if(!(adminFlg==NULL)){
//				result="manager";
//				return result;
//			}

			return result;
		}


		return result;
	}

	public ArrayList<BuyItemDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<BuyItemDTO> itemList) {
		this.itemList = itemList;
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
//	public String getAdminFlg(){
//		return adminFlg;
//	}
//	public void setAdminFlg(String adminFlg){
//		this.adminFlg=adminFlg;
//	}

//	public ArrayList<BuyItemDTO>getItemList(){
//		return itemList;
//	}
//	public void setItemList(ArrayList<BuyItemDTO>itemList){
//		this.itemList=itemList;
//	}

}
