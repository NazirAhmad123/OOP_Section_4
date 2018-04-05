package newSection;

public class Car extends Vehicle {
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;
	
	Car(String name, String size, int wheels, int doors, int gears, boolean isManual){
		super(name, size);
		this.wheels = wheels;
		this.isManual = isManual;
		this.doors = doors;
		this.gears = gears;
		
		this.currentGear = 0;
	}
	
	public void changeGear(int gear){
		this.currentGear = gear;
		System.out.println("Car's gear is changed to "
				+ this.currentGear);
	}
	public void changeVelocity(int speed, int direction){
		move(speed, direction);
	}

}
