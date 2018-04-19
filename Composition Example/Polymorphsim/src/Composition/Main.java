package sec4;

public class Main {
	public static void main(String[] args) {
		
	Wall wall1 = new Wall("North");	
	Wall wall2 = new Wall("South");	
	Wall wall3 = new Wall("East");	
	Wall wall4 = new Wall("West");
	Ceiling ceiling = new Ceiling(250, "Gray");
	Bed bed = new Bed("Calssic", 3, 2);
	Lamp lamp = new Lamp("Modern", false);
	
	Bedroom myBedroom = new Bedroom("ali's bedroom",
			wall1, wall2, wall3, wall4, ceiling, bed, lamp);
	myBedroom.makeBed();
	// Polymorphism
	}

}
