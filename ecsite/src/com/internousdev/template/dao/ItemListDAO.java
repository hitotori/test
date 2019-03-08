package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.ItemInfoDTO;
import com.internousdev.template.util.DBConnector;

public class ItemListDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	public ArrayList<ItemInfoDTO> getItemInfo()throws SQLException{
//	public List<ItemInfoDTO> getItemList() throws SQLException{
//		List<ItemInfoDTO> itemInfoDTOList=new ArrayList<ItemInfoDTO>();
		ArrayList<ItemInfoDTO> pList=new ArrayList<ItemInfoDTO>();
		String sql="SELECT *FROM item_info_transaction ORDER BY id";

//		System.out.print("item_name");
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				ItemInfoDTO dto=new ItemInfoDTO();
//				dto.setId(rs.getInt("id"));
				dto.setId(rs.getString("id"));
				dto.setItem_name(rs.getString("item_name"));
//				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_price(rs.getString("item_price"));
//				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_stock(rs.getString("item_stock"));
				dto.setInsert_date(rs.getString("insert_date"));
				pList.add(dto);

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return pList;
	}

//	public int buyItemDelete(String item_transaction_id,String user_master_id)throws SQLException{
//
//		String sql="DELETE FROM item_info_transaction WHERE item_transaction_id=? AND user_master_id=?";
//		PreparedStatement ps;
//		int result=0;
//		try{
//			ps=con.prepareStatement(sql);
//			ps.setString(1, item_transaction_id);
//			ps.setString(2, user_master_id);
//
//			result=ps.executeUpdate();
//		}catch(SQLException e){
//			e.printStackTrace();
//		}finally{
//			con.close();
//		}
//		return result;
//	}

}