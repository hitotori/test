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


	public BattleDTO getEnemyInfo(){
//		String charactersql="SELECT * FROM enemy_transaction WHERE enemy_name=ヌフイム ,enemy_hp=10, enemy_attack=10 ,enemy_defense=10,enemy_experiencepoint=2";
		String enemysql="SELECT * FROM enemy_transaction WHERE id=1";
		try {
			PreparedStatement ps = con.prepareStatement(enemysql);
//			PreparedStatement ps=con.prepareStatement(sql);
//			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setEnemyName(rs.getString("enemy_name"));
				dto.setEnemyHP(rs.getString("enemy_hp"));
				dto.setEnemyATK(rs.getString("enemy_attack"));
				dto.setEnemyDEF(rs.getString("enemy_defense"));
				dto.setEnemyEXP(rs.getString("enemy_experiencepoint"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	public BattleDTO getCharacterInfo(String loginId) {

		String charactersql = "SELECT * FROM user_transaction where login_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(charactersql);
			ps.setString(1, loginId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setCharacterName(rs.getString("character_name"));
				dto.setCharacterLv(rs.getString("character_level"));
				dto.setCharacterHP(rs.getString("character_hp"));
				dto.setCharacterATK(rs.getString("character_attack"));
				dto.setCharacterDEF(rs.getString("character_defense"));
				dto.setCharacterEXP(rs.getString("character_experiencepoint"));



			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

	public BattleDTO getBattleDTO() {
		return dto;
	}

}
