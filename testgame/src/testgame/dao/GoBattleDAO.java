package testgame.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import testgame.dto.BattleDTO;
import testgame.util.DBConnector;

public class GoBattleDAO {
		private DBConnector db=new DBConnector();
		private Connection con=db.getConnection();
		private BattleDTO dto=new BattleDTO();
//		,String adminFlg
		public BattleDTO getCharacterInfo(String characterName,String characterLv,String characterHP, String characterATK,
				String characterDEF, String characterEXP){
		String charactersql="SELECT * FROM user_transaction where character_name=? AND character_level=? AND character_hp=? "
				+ "AND character_attack=? AND character_defense=? AND character_experiencepoint=?";
//				+ " AND login_pass=?";
		//テーブルで入っている中で確定している場所のデータのみを取り出したい場合は
		// where enemyname='ヌフイム'のような表記でいいのか？

		try{
			PreparedStatement ps=con.prepareStatement(charactersql);
			ps.setString(1, characterName);
			ps.setString(2, characterLv);
			ps.setString(3, characterHP);
			ps.setString(4, characterATK);
			ps.setString(5, characterDEF);
			ps.setString(6, characterEXP);

			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				dto.setCharacterName(rs.getString("characterName"));
				dto.setCharacterLv(rs.getString("characterLv"));
				dto.setCharacterHP(rs.getString("characterHP"));
				dto.setCharacterATK(rs.getString("characterATK"));
				dto.setCharacterDEF(rs.getString("characterDEF"));
				dto.setCharacterEXP(rs.getString("characterEXP"));
				if(!(rs.getString("characterName").equals(null))){
//					sessionに入れるべきかどうか

				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;
		}
		public BattleDTO getEnemyInfo(String enemyName,String enemyHP,String enemyATK,String enemyDEF, String enemyEXP){

			String enemysql="SELECT * FROM enemy_transaction where enemy_name='ヌフイム' AND enemy_hp=10 AND enemy_attack=10 AND enemy_defense=10"
					+ "AND enemy_experiencepoint=2";
			try{
			PreparedStatement ps=con.prepareStatement(enemysql);
			ps.setString(1, enemyName);
			ps.setString(2, enemyHP);
			ps.setString(3, enemyATK);
			ps.setString(4, enemyDEF);
			ps.setString(5, enemyEXP);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				dto.setEnemyName(rs.getString("enemyName"));
				dto.setEnemyHP(rs.getString("enemyHP"));
				dto.setEnemyATK(rs.getString("enemyATK"));
				dto.setEnemyDEF(rs.getString("enemyDEF"));
				dto.setEnemyEXP(rs.getString("enemyEXP"));

			}
			}catch(Exception e){
				e.printStackTrace();
			}
			return dto;
		}

		public BattleDTO getBattleDTO(){
			return dto;
		}

}
