package chapter11.test;

public abstract class Character {
	
//	フィールド
	String name;
	int hp;
	
//	メソッド
	public abstract void attack(Matango m);
	
//	コンストラクタ
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
}
