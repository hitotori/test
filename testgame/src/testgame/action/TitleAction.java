package testgame.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import testgame.dto.LoginDTO;

public class TitleAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	public String execute() throws SQLException {
		String result = "login";
		if (session.containsKey("id")) {
//			LoginDAO dao = new LoginDAO();
			LoginDTO dto = new LoginDTO();
			session.put("login_id", dto.getLoginId());
			session.put("user_name", dto.getUserName());
			session.put("login_password", dto.getLoginPassword());
			session.put("admin_flg", dto.getAdminFlg());
			result = SUCCESS;
		}

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
