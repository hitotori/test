package testgame.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import testgame.dto.BattleDTO;
import testgame.util.DBConnector;

public class GoBattleDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private BattleDTO dto = new BattleDTO();

	// ,String adminFlg
//	public BattleDTO getCharacterInfo(String characterName, String characterLv, String characterHP, String characterATK,
//			String characterDEF, String characterEXP) {
//		String charactersql = "SELECT * FROM user_transaction where character_name=? AND character_level=? AND character_hp=? "
//				+ "AND character_attack=? AND character_defense=? AND character_experiencepoint=?";
		// + " AND login_pass=?";
		// テーブルで入っている中で確定している場所のデータのみを取り出したい場合は
		// where enemyname='ヌフイム'のような表記でいいのか？


	public BattleDTO getBattleInfo(String characterName, String characterLv, String characterHP, String characterATK,
			String characterDEF, String characterEXP,String enemyName, String enemyHP, String enemyATK, String enemyDEF, String enemyEXP){
		String sql="SELECT ut.character_name,et.enemy_name,ut.character_level,ut.character_hp,ut.character_attack,"
				+ "ut.character_defense,utcharacter_experiencepoint,et.enemy_hp,et.enemy_attack,"
				+ "et.enemy_defense,et.enemy_experiencepoint "
				+ "FROM user_transaction ut LEFT JOIN enemy_transaction et "
				+ "ON et.enemy_name='ヌフイム' WHERE ut.character_name=? AND et.enemy_name=?"
				+ " ORDER BY insert_date DESC";

		try {
//			PreparedStatement ps = con.prepareStatement(charactersql);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, characterName);
			ps.setString(2, characterLv);
			ps.setString(3, characterHP);
			ps.setString(4, characterATK);
			ps.setString(5, characterDEF);
			ps.setString(6, characterEXP);

			ps.setString(7, enemyName);
			ps.setString(8, enemyHP);
			ps.setString(9, enemyATK);
			ps.setString(10, enemyDEF);
			ps.setString(11, enemyEXP);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setCharacterName(rs.getString("characterName"));
				dto.setCharacterLv(rs.getString("characterLv"));
				dto.setCharacterHP(rs.getString("characterHP"));
				dto.setCharacterATK(rs.getString("characterATK"));
				dto.setCharacterDEF(rs.getString("characterDEF"));
				dto.setCharacterEXP(rs.getString("characterEXP"));

				dto.setEnemyName(rs.getString("enemyName"));
				dto.setEnemyHP(rs.getString("enemyHP"));
				dto.setEnemyATK(rs.getString("enemyATK"));
				dto.setEnemyDEF(rs.getString("enemyDEF"));
				dto.setEnemyEXP(rs.getString("enemyEXP"));

				if (!(rs.getString("characterName").equals(null))) {
					// sessionに入れるべきかどうか

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

//	public BattleDTO getEnemyInfo(String enemyName, String enemyHP, String enemyATK, String enemyDEF, String enemyEXP) {
//
//		String enemysql = "SELECT * FROM enemy_transaction where enemy_name='ヌフイム' AND enemy_hp=10 AND enemy_attack=10 AND enemy_defense=10"
//				+ "AND enemy_experiencepoint=2";
//		try {
//			PreparedStatement ps = con.prepareStatement(enemysql);
//			ps.setString(1, enemyName);
//			ps.setString(2, enemyHP);
//			ps.setString(3, enemyATK);
//			ps.setString(4, enemyDEF);
//			ps.setString(5, enemyEXP);
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) {
//				dto.setEnemyName(rs.getString("enemyName"));
//				dto.setEnemyHP(rs.getString("enemyHP"));
//				dto.setEnemyATK(rs.getString("enemyATK"));
//				dto.setEnemyDEF(rs.getString("enemyDEF"));
//				dto.setEnemyEXP(rs.getString("enemyEXP"));
//
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return dto;
//	}

	public BattleDTO getBattleDTO() {
		return dto;
	}

}
