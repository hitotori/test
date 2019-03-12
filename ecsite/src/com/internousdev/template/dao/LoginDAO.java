package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
		private DBConnector db=new DBConnector();
		private Connection con=db.getConnection();
		private LoginDTO dto=new LoginDTO();
//		,String adminFlg
		public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){
		String sql="SELECT * FROM login_user_transaction where login_id=? AND login_pass=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
//			追記

			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
//				追記
//				dto.setAdminFlg(rs.getString("admin_Flg"));
				if(!(rs.getString("login_id").equals(null))){
//					追記
//					if(rs.getString("admin_Flg").equals(null)){
//						dto.setLoginFlg(true);
//					}
					dto.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;
		}
		public LoginDTO getLoginDTO(){
			return dto;
		}

}
