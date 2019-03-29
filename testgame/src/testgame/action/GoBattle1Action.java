package testgame.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import testgame.dao.GoBattleDAO;
import testgame.dto.BattleDTO;

public class GoBattle1Action extends ActionSupport implements SessionAware{

	private String characterName;
	private String characterLv;
	private String characterHP;
	private String characterATK;
	private String characterDEF;
	private String characterEXP;

	private String enemyName;
	private String enemyHP;
	private String enemyATK;
	private String enemyDEF;
	private String enemyEXP;
	public Map<String,Object>session;
	private GoBattleDAO dao=new GoBattleDAO();
	private BattleDTO dto=new BattleDTO();
//	private ArrayList<BuyItemDTO> itemList=new ArrayList<BuyItemDTO>();



	public String execute() throws SQLException{
//		String result =ERROR;
		dto=dao.getCharacterInfo(characterName,characterLv,characterHP,characterATK,characterDEF,characterEXP);
//		,adminFlg
//		session.put("loginUser",dto);
		session.put(dto.getCharacterName(), characterName);
		session.put(dto.getCharacterLv(), characterLv);
		session.put(dto.getCharacterHP(), characterHP);
		session.put(dto.getCharacterATK(),characterATK);
		session.put(dto.getCharacterDEF(), characterDEF);
		session.put(dto.getCharacterEXP(), characterEXP);


//		 dto=dao.getEnemyInfo(enemyName,enemyHP,enemyATK,enemyDEF,enemyEXP);
//		session.put(dto.getEnemyName(), enemyName);
//		session.put(dto.getEnemyHP(), enemyHP);
//		session.put(dto.getEnemyATK(), enemyATK);
//		session.put(dto.getEnemyDEF(), enemyDEF);
//		session.put(dto.getEnemyEXP(), enemyEXP);

			String result=SUCCESS;

			return result;
		}




	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterLv() {
		return characterLv;
	}

	public void setCharacterLv(String characterLv) {
		this.characterLv = characterLv;
	}

	public String getCharacterHP() {
		return characterHP;
	}

	public void setCharacterHP(String characterHP) {
		this.characterHP = characterHP;
	}

	public String getCharacterATK() {
		return characterATK;
	}

	public void setCharacterATK(String characterATK) {
		this.characterATK = characterATK;
	}

	public String getCharacterDEF() {
		return characterDEF;
	}

	public void setCharacterDEF(String characterDEF) {
		this.characterDEF = characterDEF;
	}

	public String getCharacterEXP() {
		return characterEXP;
	}

	public void setCharacterEXP(String characterEXP) {
		this.characterEXP = characterEXP;
	}

	public String getEnemyName() {
		return enemyName;
	}

	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}

	public String getEnemyHP() {
		return enemyHP;
	}

	public void setEnemyHP(String enemyHP) {
		this.enemyHP = enemyHP;
	}

	public String getEnemyATK() {
		return enemyATK;
	}

	public void setEnemyATK(String enemyATK) {
		this.enemyATK = enemyATK;
	}

	public String getEnemyDEF() {
		return enemyDEF;
	}

	public void setEnemyDEF(String enemyDEF) {
		this.enemyDEF = enemyDEF;
	}

	public String getEnemyEXP() {
		return enemyEXP;
	}

	public void setEnemyEXP(String enemyEXP) {
		this.enemyEXP = enemyEXP;
	}

	public Map<String,Object>getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object>session ){
		this.session = session;
	}


}