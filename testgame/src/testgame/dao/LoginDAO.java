//package testgame.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//import testgame.dto.LoginDTO;
//import testgame.util.DBConnector;
//
//public class LoginDAO {
//	private DBConnector db = new DBConnector();
//	private Connection con = db.getConnection();
//	private LoginDTO dto = new LoginDTO();
//
//	public LoginDTO getLoginUserInfo(String loginId, String loginPassword, String characterName) {
//		String sql = "SELECT * FROM user_transaction where login_id=? AND login_pass=? AND character_name=?";
//
//		try {
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, loginId);
//			ps.setString(2, loginPassword);
//			ps.setString(3, characterName);
//
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) {
//				dto.setLoginId(rs.getString("login_id"));
//				dto.setLoginPassword(rs.getString("login_pass"));
//				dto.setUserName(rs.getString("user_name"));
//				dto.setCharacterName(rs.getString("character_name"));
//				if (!(rs.getString("login_id").equals(null))) {
//					dto.setLoginFlg(true);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return dto;
//	}
//
//}





package testgame.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import testgame.dto.LoginDTO;
import testgame.util.DBConnector;

public class LoginDAO {
		private DBConnector db=new DBConnector();
		private Connection con=db.getConnection();
		private LoginDTO dto=new LoginDTO();
		public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		String sql="SELECT * FROM user_transaction where login_id=? AND login_pass=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				if(!(rs.getString("login_id").equals(null))){

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