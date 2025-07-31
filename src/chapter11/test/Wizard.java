package chapter11.test;

public class Wizard extends Character {
	
//  フィールド
	int mp;
	
//	マタンゴへの攻撃(mp使用)
	public void attack(Matango m) {
		this.mp -= 5;
		System.out.println("テストマンは火の玉を放った！");
		m.hp -= 20;
		System.out.println("マタンゴに20ポイントのダメージ");
		System.out.println(m.hp);
	}
	
//	コンストラクタ
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	
}

