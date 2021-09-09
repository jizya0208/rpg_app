package characters;
import monsters.Monster;

public class Hero extends Character {
	int mp;
	public Hero(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException
				("名前がnullである。処理を中断");
		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException
				("名前が短すぎる。処理を中断");
		}
		if(name.length() >= 8) {
			throw new IllegalArgumentException
				("名前が長すぎる。処理を中断");
		}
	this.name = name;
	}
	public void run() {
		System.out.println(this.name + "はスタコラサッサと逃げ出した");
	}
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージを与えた！");
	}
	public int getHp() { return this.hp; }
	public void setHp(int hp) { this.hp = hp; }
	public int getMp() { return this.mp; }
	public void setMp(int mp) { this.mp = mp; }
}
