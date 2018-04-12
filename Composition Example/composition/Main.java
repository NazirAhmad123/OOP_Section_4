package composition;

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
		
//		EncapsulatedPlayer p2 = new EncapsulatedPlayer("ali", "sword",500);
//		System.out.println("Remainig health " + p2.getHealth());
		
		//Printer printer = new Printer(50, true);
//		Printer printer = new Printer(50, false);
//		int printTheserPages = printer.printPages(8);
//		System.out.println("Pages printed are: " + printTheserPages
//				+ "\nNew total is: " + printer.getPagesPrinted());
//		printTheserPages = printer.printPages(4);
//		
//		System.out.println("Pages printed are: " + printTheserPages
//				+ "\nNew total is: " + printer.getPagesPrinted());
		Dimension dimension = new Dimension(12,12,4);
		Case theCase = new Case("BG2123","Asus",dimension);
	
		Monitor monitor = new Monitor("Wc32","Dell", new Resolution(1200,1200));
		
		Motherboard motherboard = new Motherboard("GH#4","Acer");
		
		Computer myComputer = new Computer(theCase,monitor,motherboard);
//		theCase.pressPowerButton();
//		monitor.drawPixelsAt(12, 12, "Blue");
//		motherboard.loadProgram("Windows 8.1");
		myComputer.powerUp();
	}

}
