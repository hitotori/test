package testgame.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import testgame.util.DBConnector;
//import testgame.util.DateUtil;
//↑いる？

public class UserCreateDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
//	private DateUtil dateUtil=new DateUtil();

	private String sql="INSERT INTO login_user_transaction(login_id,login_pass,user_name,character_name)VALUES(?,?,?,?)";

	public void createuser(String loginUserId,String loginuserPassword,String userName,String characterName)throws SQLException{
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginuserPassword);
			ps.setString(3, userName);
			ps.setString(4, characterName);
//			ps.setString(4, dateUtil.getDate());

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

}