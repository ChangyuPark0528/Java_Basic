package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.name = "초보자";
		System.out.println("p1의 주소값: " + p1);
		p1.characterInfo();
		
		System.out.println("----------------------------------------");
		
		Player p2 = new Player("초보2");
		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("----------------------------------------");
		
		Player p3 = new Player("초보3", 200);
		p3.characterInfo();
		
		System.out.println("----------------------------------------");
		
		p3.attack(p2);
		p2.attack(p1);

		System.out.println("----------------------------------------");
		
		Warrior w1 = new Warrior("작은거인");
		w1.characterInfo();
		
		System.out.println("----------------------------------------");
		
		Mage m1 = new Mage("법사최고");
		m1.characterInfo();
		
		System.out.println("----------------------------------------");
		
		Hunter h1 = new Hunter("헌터");
		h1.characterInfo();
		
	}

}







