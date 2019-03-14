package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;
public class BuyItemDAO {

		public ArrayList<BuyItemDTO> getBuyItemInfo()throws SQLException{
//		public BuyItemDTO getBuyItemInfo(){

			DBConnector db=new DBConnector();
			Connection con=db.getConnection();
//			BuyItemDTO dto=new BuyItemDTO();
			ArrayList<BuyItemDTO> itemList=new ArrayList<BuyItemDTO>();

		String sql="SELECT * FROM item_info_transaction";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

//			下記の構文を[if]ではなく[while]にすることで一度の処理でなく、複数回の処理にして
//			複数のアイテムを読み込ませる。
//			while
				while(rs.next()){
					BuyItemDTO bidto=new BuyItemDTO();
				bidto.setId(rs.getString("id"));
				bidto.setItemName(rs.getString("item_name"));
				bidto.setItemPrice(rs.getString("item_price"));
				itemList.add(bidto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return itemList;
//		return dto;
		}

}
