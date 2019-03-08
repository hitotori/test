package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.ProductEntryDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductEntryCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String execute() throws SQLException {
		ProductEntryDAO dao = new ProductEntryDAO();
		dao.EntryItem(session.get("item_name").toString(), session.get("item_price").toString(), session.get("item_stock").toString());
		String result = SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.struts2.interceptor.SessionAware;
//
//import com.internousdev.template.dao.ProductEntryDAO;
//import com.internousdev.template.dto.ProductEntryDTO;
//import com.opensymphony.xwork2.ActionSupport;

//public class ProductEntryCompleteAction extends ActionSupport implements SessionAware{
//	private String item_name;
//	private int item_price;
//	private int item_stock;
//
//	List<ProductEntryDTO> ProductEntryDTOList=new ArrayList<ProductEntryDTO>();
//	private Map<String,Object>session;
//
//	public String execute(){
//		String result=ERROR;
//		ProductEntryDAO dao=new ProductEntryDAO();
//		int count=dao.insert(item_name, item_price, item_stock);
//		if(count>0){
//			ProductEntryDTOList=dao.select();
//			session.put("ProductEntryDTOList",ProductEntryDTOList);
//			result=SUCCESS;
//		}
//		return result;
//	}
//	public String getItem_name() {
//	return item_name;
//	}
//	public void setItem_name(String item_name) {
//	this.item_name = item_name;
//	}
//	public int getItem_price() {
//	return item_price;
//	}
//	public void setItem_price(int item_price) {
//	this.item_price = item_price;
//	}
//	public int getItem_stock() {
//	return item_stock;
//	}
//	public void setItem_Stock(int item_stock) {
//	this.item_stock = item_stock;
//	}
//
//	public Map<String,Object>getSession(){
//		return session;
//	}
//	public void setSession(Map<String,Object>session){
//		this.session=session;
//	}
//
//}
