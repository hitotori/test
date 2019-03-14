package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	private MyPageDAO mpdao=new MyPageDAO();
	private ArrayList<MyPageDTO> mpList=new ArrayList<MyPageDTO>();
	public String deleteFlg;
	private String message;
	public String execute() throws SQLException{
		if(!session.containsKey("login_user_id")){
			return ERROR;
		}

		if(deleteFlg==null){
			String item_transaction_id=session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();

			mpList=mpdao.getMyPageUserInfo(item_transaction_id,user_master_id);
		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result=SUCCESS;
		return result;
	}

	public void delete() throws SQLException{
//		MyPageDAO mpdao=new MyPageDAO();

		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();

		int res=mpdao.buyItemHistoryDelete(item_transaction_id, user_master_id);
		if(res>0){
			mpList=null;
			setMessage( "商品情報を正しく削除しました。");
		}else if(res==0){
			setMessage("商品情報の削除に失敗しました。");
		}
	}

	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

	public ArrayList<MyPageDTO> getMpList(){
		return mpList;
	}
	public void setMpList(ArrayList<MyPageDTO>mpList){
		this.mpList=mpList;
	}
	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message=message;
	}

}
