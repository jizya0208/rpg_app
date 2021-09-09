package characters;
import monsters.Monster;

public abstract class Character {
	String name;
	int hp;
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public void run() {};
	public abstract void attack(Monster m);
}
