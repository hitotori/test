package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class ProductEntryDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "INSERT INTO item_info_transaction (item_name,item_price,item_stock,insert_date) VALUES(?, ? ,?, ?)";

	public void EntryItem(String item_name, String item_price, String item_stock) throws SQLException {

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_name);
			ps.setInt(2, Integer.parseInt(item_price));
			ps.setInt(3, Integer.parseInt(item_stock));
			ps.setString(4, dateUtil.getDate());
			ps.execute();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}




//以下は登録アクションは実行できるがStockがMySQLにインサートされなかったもの
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.internousdev.template.dto.ProductEntryDTO;
//import com.internousdev.template.util.DBConnector;
//
//public class ProductEntryDAO {
//	List<ProductEntryDTO> ProductEntryDTOList=new ArrayList<ProductEntryDTO>();
//
//	public List<ProductEntryDTO>select(){
//		DBConnector db=new DBConnector();
//		Connection con=db.getConnection();
//
//		String sql="select * from item_info_transaction";
//		try{
//			PreparedStatement ps=con.prepareStatement(sql);
//			ResultSet rs=ps.executeQuery();
//
//			while(rs.next()){
//				ProductEntryDTO dto=new ProductEntryDTO();
//				dto.setItem_name(rs.getString("item_name"));
//				dto.setItem_price(rs.getInt("item_price"));
//				dto.setItem_stock(rs.getInt("item_stock"));
//				ProductEntryDTOList.add(dto);
//			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		try{
//			con.close();
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		return ProductEntryDTOList;
//	}
//
//	public int insert(String item_name,int item_price,int item_stock){
//		int result=0;
//		DBConnector db=new DBConnector();
//		Connection con=db.getConnection();
//
//		String sql="insert into item_info_transaction (item_name,item_price,item_stock) VALUES(?,?,?)";
//		try{
//			PreparedStatement ps=con.prepareStatement(sql);
//			ps.setString(1, item_name);
//			ps.setInt(2, item_price);
//			ps.setInt(3, item_stock);
//			int i=ps.executeUpdate();
//			if(i>0){
//				System.out.println(i+"件登録されました");
//				result=i;
//			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		try{
//			con.close();
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		return result;
//		}
//}
//
