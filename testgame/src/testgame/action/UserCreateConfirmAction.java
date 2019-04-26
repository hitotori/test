package testgame.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String characterName;
	private int characterLv;
	private int characterMaxHP;
	private int characterHP;
	private int characterAttack;
	private int characterDefense;
	private int characterExp;
	public Map<String,Object>session;
	private String errorMessage;


	public String execute(){
		String result =SUCCESS;

		int randomValue1 = (int)(Math.random() * 10) + 1;
		int randomValue2 = (int)(Math.random() * 10) + 1;
		int randomValue3 = (int)(Math.random() * 10) + 1;
		if(!(loginUserId.equals(""))&&!(loginPassword.equals(""))&&!(userName.equals(""))&&!(characterName.equals(""))){


			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
			session.put("characterName", characterName);
			session.put("characterLv",characterLv);
			session.put("characterMaxHP", characterMaxHP+randomValue1);
			session.put("characterHP",characterMaxHP+randomValue1);
			session.put("characterAttack", characterAttack+randomValue2);
			session.put("characterDefense", characterDefense+randomValue3);
			session.put("characterExp",characterExp);

		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
		return result;
	}



	public int getCharacterLv() {
		return characterLv;
	}



	public void setCharacterLv(int characterLv) {
		this.characterLv = characterLv;
	}



	public int getCharacterMaxHP() {
		return characterMaxHP;
	}



	public void setCharacterMaxHP(int characterMaxHP) {
		this.characterMaxHP = characterMaxHP;
	}



	public int getCharacterHP() {
		return characterHP;
	}



	public void setCharacterHP(int characterHP) {
		this.characterHP = characterHP;
	}



	public int getCharacterAttack() {
		return characterAttack;
	}



	public void setCharacterAttack(int characterAttack) {
		this.characterAttack = characterAttack;
	}



	public int getCharacterDefense() {
		return characterDefense;
	}



	public void setCharacterDefense(int characterDefense) {
		this.characterDefense = characterDefense;
	}



	public int getCharacterExp() {
		return characterExp;
	}



	public void setCharacterExp(int characterExp) {
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