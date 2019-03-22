//package testgame.action;
//
//import java.sql.SQLException;
////import java.util.ArrayList;
//import java.util.Map;
//
//import org.apache.struts2.interceptor.SessionAware;
//
//import com.opensymphony.xwork2.ActionSupport;
//
////import com.internousdev.template.dao.BuyItemDAO;
//import testgame.dao.LoginDAO;
////import com.internousdev.template.dto.BuyItemDTO;
//import testgame.dto.LoginDTO;
//
//public class LoginAction extends ActionSupport implements SessionAware {
//
//	private String loginId;
//	private String loginPassword;
//	private String characterName;
//	public Map<String, Object> session;
//	private LoginDAO dao = new LoginDAO();
//	private LoginDTO dto = new LoginDTO();
//	private String userId;
//	private String userPassword;
//
//	public String execute() throws SQLException {
//		String result = ERROR;
//		// dto=dao.getLoginUserInfo(loginId, loginPassword);
//		// session.put("loginUser",dto);
//		// if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
//		// result=SUCCESS;
//		// return result;
//		// }
//		dto = dao.getLoginUserInfo(loginId, loginPassword, characterName);
//		((LoginDTO)session.get("loginUser")).getLoginFlg();
//		if (userId == loginId && userPassword == loginPassword) {
//			dto.setLoginId(userId);
//			dto.setLoginPassword(userPassword);
//			result = SUCCESS;
//			if (characterName == null) {
//				result = "tutorial";
//			}
//
//		}
//
//		return result;
//	}
//
//	public String getCharacterName() {
//		return characterName;
//	}
//
//	public void setCharacterName(String characterName) {
//		this.characterName = characterName;
//	}
//
//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getUserPassword() {
//		return userPassword;
//	}
//
//	public void setUserPassword(String userPassword) {
//		this.userPassword = userPassword;
//	}
//
//	public String getLoginId() {
//		return loginId;
//	}
//
//	public void setLoginId(String loginId) {
//		this.loginId = loginId;
//	}
//
//	public String getLoginPassword() {
//		return loginPassword;
//	}
//
//	public void setLoginPassword(String loginPassword) {
//		this.loginPassword = loginPassword;
//	}
//
//	public Map<String, Object> getSession() {
//		return session;
//	}
//
//	@Override
//	public void setSession(Map<String, Object> session) {
//		this.session = session;
//	}
//
//}






package testgame.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import testgame.dao.LoginDAO;
import testgame.dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object>session;
	private LoginDAO dao=new LoginDAO();
	private LoginDTO dto=new LoginDTO();



	public String execute() throws SQLException{
		String result =ERROR;
		dto=dao.getLoginUserInfo(loginUserId, loginPassword);

		session.put("loginUser",dto);
		while(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;

			return result;
		}


		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session ){
		this.session = session;
	}
}
