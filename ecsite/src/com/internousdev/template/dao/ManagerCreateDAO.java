package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class ManagerCreateDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil dateUtil=new DateUtil();

	private String sql="INSERT INTO login_user_transaction(login_id,login_pass,user_name,insert_date,admin_flg)VALUES(?,?,?,?,?)";

	public void createuser(String loginUserId,String loginuserPassword,String userName,String admin_Flg)throws SQLException{
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginuserPassword);
			ps.setString(3, userName);
			ps.setString(4, dateUtil.getDate());
			ps.setString(5, admin_Flg);

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

//	private String admin_Flg() {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
//	}

}
