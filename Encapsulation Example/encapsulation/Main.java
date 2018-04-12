package encapsulation;

public class Main {
	public static void main(String[] args) {
		//System.out.println("Hello world!");
		
		
//		4 main features of oop.
		
		// Inheritance
		// Encapsulation
		// Composition
		// Polymorphisme
		
//		Player p1 = new Player();
//		
//		p1.playerName = "Ahmad";
//		p1.health = 20;
//		p1.weapon = "sword";
//		
//		int damageCasued = 10;
//		
//		p1.loseHealth(damageCasued);
//		System.out.println("Remaining health is: "
//				+ p1.remainingHealth());
//		
//		damageCasued = 12;
//		p1.health = 50;
//		p1.loseHealth(damageCasued);
//		System.out.println("Remaining health is: "
//				+ p1.remainingHealth());
		
		EncapsulatedPlayer p2 = new EncapsulatedPlayer("ali", "sword",500);
		System.out.println("Remainig health " + p2.getHealth());
		
	}

}
