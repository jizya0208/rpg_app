package characters;
import monsters.Monster;

public class Thief extends Character {
	private int mp;
	public Thief( String name, int hp, int mp ) {
		super(name, hp);
		this.mp = mp;
	}
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	public Thief(String name) {
		this(name, 40);
	}
	public void run() {
		System.out.println(this.name + "はスタコラサッサと逃げ出した");
	}
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に6ポイントのダメージを与えた！");
	}
	public int getHp() { return this.hp; }
	public void setHp(int hp) { this.hp = hp; }
	public int getMp() { return this.mp; }
	public void setMp(int mp) { this.mp = mp; }
}
