package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.ItemInfoDTO;
import com.internousdev.template.util.DBConnector;

public class ItemListDAO {

//	public ArrayList<ItemInfoDTO> getItemInfo()throws SQLException{
	public List<ItemInfoDTO> getItemInfo() throws SQLException{

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		List<ItemInfoDTO> pList=new ArrayList<ItemInfoDTO>();
//		ArrayList<ItemInfoDTO> pList=new ArrayList<ItemInfoDTO>();
		String sql="SELECT * FROM item_info_transaction ORDER BY id";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				ItemInfoDTO dto=new ItemInfoDTO();

				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				dto.setInsert_date(rs.getString("insert_date"));
				dto.setUpdate_date(rs.getString("update_date"));
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