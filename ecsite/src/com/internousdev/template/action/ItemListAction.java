package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.ItemListDAO;
import com.internousdev.template.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{
	private ArrayList<ItemInfoDTO> pList=new ArrayList<ItemInfoDTO>();
//	private List<ItemInfoDTO> pList=newArrayList<ItemInfoDTO>();
	public Map<String,Object>session;
	public String execute() throws SQLException{
		ItemListDAO dao=new ItemListDAO();
		ItemInfoDTO dto=new ItemInfoDTO();
		pList=dao.getItemInfo();
		session.put("id", dto.getId());
		session.put("item_name", dto.getItem_name());
		session.put("item_price", dto.getItem_price());
		session.put("item_stock", dto.getItem_stock());
		session.put("insert_date", dto.getInsert_date());

//		if(!(pList.size()>0)){
//			pList=null;
//		}
		String ret=SUCCESS;
		return ret;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public ArrayList<ItemInfoDTO>getPList(){
		return pList;
	}
	public void setPList(ArrayList<ItemInfoDTO>pList){
		this.pList=pList;

	}
}