package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerHomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	public String execute(){
		String result="login";
		if(session.containsKey("id")){
			BuyItemDAO bidao=new BuyItemDAO();
//			ArrayList<BuyItemDTO> bidto=bidao.getBuyItemInfo();
			BuyItemDTO bidto=bidao.getBuyItemInfo();
			session.put("id",bidto.getId());
			session.put("buyItem_name",bidto.getItemName());
			session.put("buyItem_price",bidto.getItemPrice());

			result=SUCCESS;
		}

		return result;
	}

	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}


}