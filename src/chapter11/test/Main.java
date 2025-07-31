package chapter11.test;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println();
		System.out.println();
		//	マタンゴ生成
		Matango m = new Matango();

		//	あえてCharacter型で生成(多態性)
		Character c = new Wizard("テストマン", 100, 100);

		//	キャラクター型で攻撃(多態性)
		c.attack(m);

		//	キャスト変換出来るか確認
		if (c instanceof Wizard) {

			//		mpの結果を表示(キャスト変換)
			Wizard w = (Wizard) c;

			//		mpを表示
			System.out.println(w.mp);

		}

	}
}
