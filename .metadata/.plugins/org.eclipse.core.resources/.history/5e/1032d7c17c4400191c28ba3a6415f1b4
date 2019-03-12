package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.ItemListDAO;
import com.internousdev.template.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware{
//	private ArrayList<ItemInfoDTO> pList=new ArrayList<ItemInfoDTO>();
	private List<ItemInfoDTO> pList=new ArrayList<ItemInfoDTO>();
	private Map<String,Object>session;
	public String execute() throws SQLException{
		ItemListDAO dao=new ItemListDAO();
//		ItemInfoDTO dto=new ItemInfoDTO();
		pList=dao.getItemInfo();
//		for(ItemInfoDTO a:pList){
//		System.out.print(a.getItemName());
//		}
//		session.put("id", dto.getId());
//		session.put("item_name", dto.getItemName());
//		session.put("item_price", dto.getItemPrice());
//		session.put("item_stock", dto.getItemStock());
//		session.put("insert_date", dto.getInsert_date());
//		session.put("update_date", dto.getUpdate_date());

//		if(!(pList.size() > 0)) {
//			pList = null;
//		}
		String result=SUCCESS;
		return result;
	}

	public List<ItemInfoDTO> getpList() {
		return pList;
	}

	public void setpList(List<ItemInfoDTO> pList) {
		this.pList = pList;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
//	public ArrayList<ItemInfoDTO>getPList(){
//		return pList;
//	}
//	public void setPList(ArrayList<ItemInfoDTO>pList){
//		this.pList=pList;
//  }

}
