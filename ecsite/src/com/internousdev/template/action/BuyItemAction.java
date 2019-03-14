package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	private int[] count;
	private String pay;
	private int[] index;
	private int roop=0;
	private ArrayList<BuyItemDTO> itemList=new ArrayList<BuyItemDTO>();
	private ArrayList<BuyItemDTO> selectList=new ArrayList<BuyItemDTO>();



	public String execute(){
		String result=SUCCESS;
//		BuyItemDTO bidto=new BuyItemDTO();
			itemList=(ArrayList<BuyItemDTO>)session.get("itemList");
			for(int i:count){
			System.out.println("count:"+i); //includes All COUNT
			}
			for(int i:index){
			System.out.println("index:"+i);
			}

			//Iterator<BuyItemDTO> itr=itemList.iterator();
			try{
				for(BuyItemDTO dto:itemList){
				for(int i:index){
					if(i==roop){
						BuyItemDTO bidto=new BuyItemDTO();
//						selectList=bidto.getItemSelect();
						bidto.setId("id");
						bidto.setItemName("item_name");
						bidto.setItemPrice("item_price");
						bidto.setCount(roop);
						selectList.add(bidto);
					}
				}
				roop++;
			}
			}catch(Exception e){
				System.out.println("ERROR");
			}



//		for(int i:index){
//			System.out.println("indexity"+i);
//		}
//		System.out.println("payment:"+pay);
//		for(int i:count){
//			System.out.println("quantity:"+i);
//		}

		return result;
	}

//	public String execute(){
//		String result=SUCCESS;
//		session.put("count",count);
//		int intCount=Integer.parseInt(session.get("count").toString());
//		int intPrice=Integer.parseInt(session.get("buyItem_price").toString());
//		session.put("buyItem_price",intCount*intPrice);
//		String payment;
//		if(pay.equals("1")){
//			payment="現金払い";
//			session.put("pay",payment);
//		}else{
//			payment="クレジットカード";
//			session.put("pay",payment);
//		}
//		return result;
//	}

	public int[] getIndex() {
		return index;
	}

	public List<BuyItemDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<BuyItemDTO> itemList) {
		this.itemList = itemList;
	}

	public void setIndex(int[] index) {
		this.index = index;
	}
	public int[] getCount(){
		return count;
	}
	public void setCount(int[] count){
		this.count=count;
	}
	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay=pay;
	}
	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}
