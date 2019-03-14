package com.internousdev.template.dto;

public class BuyItemDTO {
	private String id;
	private String itemName;
	private String itemPrice;
	private int count;

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}

}
