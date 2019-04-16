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

//	private String LoginId;


	public String execute() throws SQLException{
		String result =ERROR;
		dto=dao.getLoginUserInfo(loginUserId, loginPassword);

		session.put("loginUser",dto);
		session.put("loginId", dto.getLoginId());
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
