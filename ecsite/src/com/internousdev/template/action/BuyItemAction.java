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
//	private int countroop=0;
	private ArrayList<BuyItemDTO> itemList=new ArrayList<BuyItemDTO>();
//	private ArrayList<BuyItemDTO> selectList=new ArrayList<BuyItemDTO>();
	private String payment;
	private ArrayList<BuyItemDTO> selectList;






	@SuppressWarnings("unchecked")
	public String execute(){
		String result=SUCCESS;
//		BuyItemDTO bidto=new BuyItemDTO();
			itemList=(ArrayList<BuyItemDTO>)session.get("itemList");
//			for(int i:count){
//			System.out.println("count:"+i); //includes All COUNT
//			}
//			for(int i:index){
//			System.out.println("index:"+i);
//			}

			//Iterator<BuyItemDTO> itr=itemList.iterator();

//			int size=itemList.size();
//			+for(int i:index =0;i<size;i++)
//			上の必要性
			try{
				for(BuyItemDTO dto:itemList){
				for(int i:index){
					if(i==roop){

						System.out.println(roop);
//						下のnew 使うとroopの際にArrayListが書き換える?
						selectList=new ArrayList<BuyItemDTO>();
						BuyItemDTO bidto=new BuyItemDTO();
//						selectList=bidto.getItemSelect();
						bidto.setId(dto.getId());
						bidto.setItemName(dto.getItemName());
						bidto.setItemPrice(dto.getItemPrice());

						bidto.setCount(count[roop]);

					if(pay.equals("1")){
						payment="現金払い";
//						session.put("pay",payment);
						bidto.setPay("payment");
						selectList.add(bidto);
					}else{
						payment="クレジットカード";
//						session.put("pay",payment);
						bidto.setPay("payment");
						selectList.add(bidto);
					}
//							}
//						}
//						countroop++;
						selectList.add(bidto);
						System.out.println(selectList.get(0).getId());
						System.out.println(selectList.get(0).getItemName());
						System.out.println(selectList.get(0).getItemPrice());
						System.out.println(selectList.get(0).getCount());
						System.out.println(selectList.get(0).getPay());


						System.out.println(selectList.get(1).getId());
						System.out.println(selectList.get(1).getItemName());
						System.out.println(selectList.get(1).getItemPrice());
						System.out.println(selectList.get(1).getCount());
						System.out.println(selectList.get(1).getPay());

						System.out.println(selectList.get(2).getId());
						System.out.println(selectList.get(2).getItemName());
						System.out.println(selectList.get(2).getItemPrice());
						System.out.println(selectList.get(2).getCount());
					}
				}
				roop++;
				}

//				for (int i=0; i<itemList.size(); i++) {
//					for (int j=0; j<index.length;j++) {
//						if(i == j) {
//
//						}
//					}
//
//				}
//
//			}

			}catch(Exception e){
				System.out.println("ERROR");
			}


//			selectList=new ArrayList<BuyItemDTO>();
//			BuyItemDTO bidto=new BuyItemDTO();
//			if(pay.equals("1")){
//				payment="現金払い";
//				session.put("pay",payment);
//				bidto.setPay("payment");
//				selectList.add(bidto);
//			}else{
//				payment="クレジットカード";
//				session.put("pay",payment);
//				bidto.setPay("payment");
//				selectList.add(bidto);
//			}
//		for(int i:index){
//			System.out.println("indexity"+i);
//		}
//		System.out.println("payment:"+pay);

//		for(int i:count){
//			System.out.println("quantity:"+i);
//		}



//			System.out.println(payment);

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
//			session.put("pay",paymCent);
//		}else{
//			payment="クレジットカード";
//			session.put("pay",payment);
//		}
//		return result;
//	}



	public String getPayment() {
		return payment;
	}


	public ArrayList<BuyItemDTO> getSelectList() {
		return selectList;
	}


	public void setSelectList(ArrayList<BuyItemDTO> selectList) {
		this.selectList = selectList;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}

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
