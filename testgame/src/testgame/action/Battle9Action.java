package testgame.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Battle9Action extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String jaku;
	private String kyou;
	private String ecp;


	public String execute() throws Exception {

		String result=ERROR;
		int characterHP= Integer.parseInt(String.valueOf(session.get("characterHP")));
		int characterAttack=Integer.parseInt(String.valueOf(session.get("characterATK")));
		int characterDefense=Integer.parseInt(String.valueOf(session.get("characterDEF")));
		int enemyHP=Integer.parseInt(String.valueOf(session.get("enemyHP")));
		int enemyAttack=Integer.parseInt(String.valueOf(session.get("enemyATK")));
		int enemyDefense=Integer.parseInt(String.valueOf(session.get("enemyDEF")));
		int randomValue1 = (int)(Math.random() * 10) + 1;
		int randomValue2 = (int)(Math.random() * 20) + 6;
		int randomValue3 = (int)(Math.random() * 10) + 1;
		int randomValue4 = (int)(Math.random() * 20) + 6;
		int enemyRandom = (int)(Math.random() * 10) +1;
		String battleFlg=String.valueOf(session.get("battleFlg"));



		if(battleFlg.equals("0")){
			if(enemyHP >= 0 || characterHP >= 0) {
				try {
					if(jaku.equals("1")){
						if((characterAttack-enemyDefense)<=0){
							session.put("damage2", randomValue1);
							session.put("enemyHP",enemyHP-randomValue1);
						}else{
						//charcterの攻撃
						session.put("enemyHP",(enemyHP -((characterAttack-enemyDefense)+randomValue1)));
						session.put("damage", ((characterAttack-enemyDefense)+randomValue1));
						}

						int enemyHPafter=Integer.parseInt(String.valueOf(session.get("enemyHP")));
						if (enemyHPafter <= 0) {
							//死亡判定
							result="win";
							return result;
						}
					}


						//別攻撃手段の場合
					if(kyou.equals("2")){
						if((characterAttack-enemyDefense)<=0){
							session.put("damage2", randomValue2);
							session.put("enemyHP",enemyHP-randomValue2);
						}else{
						session.put("enemyHP",(enemyHP -((characterAttack-enemyDefense)+randomValue2)));
						session.put("damage", ((characterAttack-enemyDefense)+randomValue2));
						}

						int enemyHPafter=Integer.parseInt(String.valueOf(session.get("enemyHP")));
						if (enemyHPafter <= 0) {
							//死亡判定
							result="win";
							return result;
						}
					}
					if(ecp.equals("3")){
						//逃げる場合（確定成功)
						result="back";
						return result;
					}


					//enemyの行動

					if(enemyRandom<=7){
						if((enemyAttack-characterDefense)<=0){
							session.put("damage2", randomValue3);
							session.put("characterHP",characterHP-randomValue3);
						}else{
						//enemyの攻撃
						session.put("characterHP",(characterHP -((enemyAttack-characterDefense)+randomValue3)));
						session.put("damage2", ((characterAttack-enemyDefense)+randomValue3));
						}

						int characterHPafter=Integer.parseInt(String.valueOf(session.get("characterHP")));
						if (characterHPafter <= 0) {
							//死亡判定
							result="lose";
							return result;

						}
					}


					if(enemyRandom>7){
						if((enemyAttack-characterDefense)<=0){
							session.put("damage2", randomValue4);
							session.put("characterHP",characterHP-randomValue4);
						}else{
						//別攻撃手段の場合
						session.put("characterHP",(characterHP -((enemyAttack-characterDefense)+randomValue4)));
						session.put("damage2", ((characterAttack-enemyDefense)+randomValue4));
						}

						int characterHPafter=Integer.parseInt(String.valueOf(session.get("characterHP")));
						if (characterHPafter <= 0) {
							//死亡判定
							result="lose";
							return result;
						}
					}
				} catch (Exception e) {
				e.printStackTrace();
				}
					session.put("battleFlg", 1);
					result=SUCCESS;
			}
		}else if(battleFlg.equals("1")){
			session.put("battleFlg", 0);
			result=SUCCESS;
		}
		return result;
	}


	public String getJaku() {
		return jaku;
	}


	public void setJaku(String jaku) {
		this.jaku = jaku;
	}


	public String getKyou() {
		return kyou;
	}


	public void setKyou(String kyou) {
		this.kyou = kyou;
	}


	public String getEcp() {
		return ecp;
	}


	public void setEcp(String ecp) {
		this.ecp = ecp;
	}


	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
