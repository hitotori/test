package testgame.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String characterName;
	private String characterLv;
	private String characterHP;
	private String characterAttack;
	private String characterDefense;
	private String characterExp;
	public Map<String,Object>session;
	private String errorMessage;

	public String execute(){
		String result =SUCCESS;
		if(!(loginUserId.equals(""))&&!(loginPassword.equals(""))&&!(userName.equals(""))&&!(characterName.equals(""))){
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
			session.put("characterName", characterName);
			session.put("characterLv",characterLv);
			session.put("characterHP", characterHP);
			session.put("characterAttack", characterAttack);
			session.put("characterDefense", characterDefense);
			session.put("characterExp",characterExp);
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
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

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public Map<String,Object>getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session ){
		this.session=session;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}

}