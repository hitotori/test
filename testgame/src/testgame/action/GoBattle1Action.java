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

		dto=dao.getEnemyInfo();
		session.put("enemyName",dto.getEnemyName());
		session.put("enemyHP",dto.getEnemyHP());
		session.put("enemyATK",dto.getEnemyATK());
		session.put("enemyDEF",dto.getEnemyDEF());
		session.put("enemyEXP",dto.getEnemyEXP());

		System.out.println(dto.getEnemyName());

		String loginId;
		loginId = session.get("loginId").toString();

		dto=dao.getCharacterInfo(loginId);
		session.put("characterName",dto.getCharacterName());
		session.put("characterLv",dto.getCharacterLv());
		session.put("characterHP",dto.getCharacterHP());
		session.put("characterATK",dto.getCharacterATK());
		session.put("characterDEF",dto.getCharacterDEF());
		session.put("characterEXP",dto.getCharacterEXP());

		System.out.println("=================================");
		System.out.println(dto.getCharacterName());

			return SUCCESS;
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