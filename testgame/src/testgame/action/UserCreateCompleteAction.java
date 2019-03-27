package testgame.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import testgame.dao.UserCreateDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String characterName;
	private String characterLv;
	private String characterHP;
	private String characterAttack;
	private String characterDefense;
	private String characterExp;
	private Map<String, Object> session;
	private UserCreateDAO uccdao = new UserCreateDAO();

	public String execute() throws SQLException {
		uccdao.createuser(session.get("loginUserId").toString(),
						  session.get("loginPassword").toString(),
						  session.get("userName").toString(),
						  session.get("characterName").toString(),
						  session.get("characterLv").toString(),
						  session.get("characterHP").toString(),
						  session.get("characterAttack").toString(),
						  session.get("characterDefense").toString(),
						  session.get("characterExp").toString());
		String result = SUCCESS;

		return result;
	}

	public String getCharacterHP() {
		return characterHP;
	}

	public void setCharacterHP(String characterHP) {
		this.characterHP = characterHP;
	}

	public String getCharacterLv() {
		return characterLv;
	}

	public void setCharacterLv(String characterLv) {
		this.characterLv = characterLv;
	}

	public String getCharacterAttack() {
		return characterAttack;
	}

	public void setCharacterAttack(String characterAttack) {
		this.characterAttack = characterAttack;
	}

	public String getCharacterDefense() {
		return characterDefense;
	}

	public void setCharacterDefense(String characterDefense) {
		this.characterDefense = characterDefense;
	}

	public String getCharacterExp() {
		return characterExp;
	}

	public void setCharacterExp(String characterExp) {
		this.characterExp = characterExp;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserid(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}