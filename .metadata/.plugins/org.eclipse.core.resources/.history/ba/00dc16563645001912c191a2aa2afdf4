package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	public String execute() throws SQLException{
		String result="login";
		if(session.containsKey("id")){
			BuyItemDAO bidao=new BuyItemDAO();
			ArrayList<BuyItemDTO> itemList=bidao.getBuyItemInfo();
//			BuyItemDTO bidto=bidao.getBuyItemInfo();
			BuyItemDTO bidto=new BuyItemDTO();
			session.put("id",bidto.getId());
			session.put("buyItem_name",bidto.getItemName());
			session.put("buyItem_price",bidto.getItemPrice());
			itemList.add(bidto);
//			この処理居るのか？ArrayList<BuyItemDTO>読み込みと
//			itemList.add(bidto);の二つ

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
