package monsters;

public abstract class Monster {
	String name;
	int hp;
	public void run() {
		System.out.println("モンスターは逃げ出した");
	}
	public int getHp() { return this.hp; }
	public void setHp(int hp) { this.hp = hp; }
}
