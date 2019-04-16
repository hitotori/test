package testgame.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import testgame.status.SampleBraverStatus;
import testgame.status.SampleEnemyStatus;

public class BattleAction {
	public static void main(String[] args) throws NumberFormatException, IOException {
		SampleBraverStatus b = new SampleBraverStatus();
		SampleEnemyStatus e = new SampleEnemyStatus();
		int d = new Random().nextInt(40) + 10;
		// ランダムはnextInt(数字１)+数字２で数字２からスタートした数字１分の値に指定できる。
		b.setName("Braver");
		e.setEnemyName("Enemy");

		// System.out.println();の部分はjspにて似たように表示させる。
		// 表示はlogの場所。logを箱のギリギリで新しいやつに更新するやり方は要検討。

		System.out.println(e.getEnemyName() + "が現れた。");
		while (e.getEnemyHP() <= 0 || b.getHP() <= 0) {
			try {
				for (int i = 0; i < 2; i++) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					int num = Integer.parseInt(br.readLine());
					System.out.println(b.getName() + "の行動1:たたかう 2:まほう 3:にげる");
					switch (num) {
					case 1:
						System.out.println(b.getName() + "の攻撃");
						System.out.println(e.getEnemyName() + "に" + d + "のダメージを与えた");
						e.setEnemyHP(e.getEnemyHP() - d);

						if (e.getEnemyHP() <= 0) {
							System.out.println(e.getEnemyName() + "は倒れた");
							break;
						}

					case 2:
						System.out.println((b.getName() + "の魔法攻撃"));
						System.out.println(e.getEnemyName() + "に" + d + "のダメージを与えた");
						e.setEnemyHP(e.getEnemyHP() - d);
						if (e.getEnemyHP() <= 0) {
							System.out.println(e.getEnemyName() + "は倒れた");
							break;
						}
					case 3:
						System.out.println(("にげる"));
						System.out.println(b.getName() + "は逃げ出した");
						break;
					}
					System.out.println(e.getEnemyName() + "の行動");
					if (i == 1) {
						System.out.println(e.getEnemyName() + "の攻撃");

						System.out.println(b.getName() + "に" + d + "のダメージ");
						b.setHP(b.getHP() - d);
						if (b.getHP() <= 0) {
							System.out.println(b.getName() + "は倒れてしまった");
							break;
						}
					} else {
						System.out.println("何もしなかった");
					}
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}