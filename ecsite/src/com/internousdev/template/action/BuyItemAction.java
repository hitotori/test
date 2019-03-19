package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	private int[] count;
	private int[] index;
	private ArrayList<BuyItemDTO> selectList=new ArrayList<BuyItemDTO>();






	@SuppressWarnings("unchecked")
	public String execute(){
		String result=SUCCESS;
		ArrayList<BuyItemDTO> itemList=new ArrayList<BuyItemDTO>();
			itemList=(ArrayList<BuyItemDTO>)session.get("itemList");

			try{

				int roop=0;
//				selectList=new ArrayList<BuyItemDTO>();

				//拡張for文

				for(BuyItemDTO dto:itemList){
				for(int i:index){
					if(i==roop){

						BuyItemDTO bidto=new BuyItemDTO();
						bidto.setId(dto.getId());
						bidto.setItemName(dto.getItemName());
						bidto.setItemPrice(dto.getItemPrice());

						bidto.setCount(count[roop]);
						selectList.add(bidto);
						session.put("selectList", selectList);
//						System.out.println(selectList.get(0).getId());
//						System.out.println(selectList.get(0).getItemName());
//						System.out.println(selectList.get(0).getItemPrice());
//						System.out.println(selectList.get(0).getCount());
//
//						System.out.println(selectList.get(1).getId());
//						System.out.println(selectList.get(1).getItemName());
//						System.out.println(selectList.get(1).getItemPrice());
//						System.out.println(selectList.get(1).getCount());
//
//						System.out.println(selectList.get(2).getId());
//						System.out.println(selectList.get(2).getItemName());
//						System.out.println(selectList.get(2).getItemPrice());
//						System.out.println(selectList.get(2).getCount());
					}
				}
				roop++;
				}

//				int i = 0;
//				System.out.println("********************");
//				System.out.println("選択数" + selectList.size());
//				for(BuyItemDTO d : selectList) {
//					System.out.println(i + "件目");
//					System.out.println(d.getItemName());
//
//					i++;
//				}
//				System.out.println("********************");


				//for文


//				selectList=new ArrayList<BuyItemDTO>();
//				for (int i=0; i<itemList.size(); i++) {
//					for (int j=0; j<index.length;j++) {
//						if(i == j) {
//				BuyItemDTO bidto=new BuyItemDTO();
//				bidto.setId(itemList.get(i).getId());
//				bidto.setItemName(itemList.get(i).getItemName());
//				bidto.setItemPrice(itemList.get(i).getItemPrice());
//
//				bidto.setCount(count[i]);
//
//				selectList.add(bidto);
//				session.put("selectList", selectList);
//
//				System.out.println(roop);
//				System.out.println(selectList.get(0).getId());
//				System.out.println(selectList.get(0).getItemName());
//				System.out.println(selectList.get(0).getItemPrice());
//				System.out.println(selectList.get(0).getCount());
//
//
//				System.out.println(selectList.get(1).getId());
//				System.out.println(selectList.get(1).getItemName());
//				System.out.println(selectList.get(1).getItemPrice());
//				System.out.println(selectList.get(1).getCount());
//
//				System.out.println(selectList.get(2).getId());
//				System.out.println(selectList.get(2).getItemName());
//				System.out.println(selectList.get(2).getItemPrice());
//				System.out.println(selectList.get(2).getCount());
//						}
//					}
//
//
//				}


			}catch(Exception e){
				System.out.println("ERROR");
				e.printStackTrace();
			}
		return result;
	}


	public ArrayList<BuyItemDTO> getSelectList() {
		return selectList;
	}
	public void setSelectList(ArrayList<BuyItemDTO> selectList) {
		this.selectList = selectList;
	}


	public int[] getIndex() {
		return index;
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


	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}
