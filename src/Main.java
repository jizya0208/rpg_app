import characters.Hero;
import characters.Thief;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.setHp(thief.getHp() + 10);
	}
	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("ハットリ", baseHp);
		System.out.println(baseHp + ":" + t.getHp());
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + ":" + t.getHp());

		Hero h1 = new Hero("ハロー", 80, 10);
		Hero h2 = new Hero("ハロー", 80, 10);
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}

	}
}


