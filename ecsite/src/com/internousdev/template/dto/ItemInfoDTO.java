package com.internousdev.template.dto;

public class ItemInfoDTO {
	private String item_name;
	private String item_price ;
	private String item_stock;
	private String id;
	private String insert_date;

	public String getItem_name(){
		return item_name;
	}

	public void setItem_name(String item_name){
		this.item_name=item_name;
	}

	public String getItem_price(){
		return item_price;
	}

	public void setItem_price(String item_price){
		this.item_price=item_price;
	}
	public String getItem_stock(){
		return item_stock;
	}

	public void setItem_stock(String item_stock){
		this.item_stock=item_stock;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}

}