package newSection;

public class Vehicle {
	private String name;
	private String size;
	
	private int currentDirection;
	private int currentVelocity;
	
    Vehicle(String name, String size){
    	this.name = name;
    	this.size = size;
    	this.currentDirection = 0;
    	this.currentVelocity = 0;
    }
    
    public void steer(int direction){
    	this.currentDirection = direction;
    	System.out.println("Vehicle is steering at "
    			+ this.currentDirection + " degrees.");
    }
    public void move(int velocity, int direction){
    	this.currentDirection = direction;
    	this.currentVelocity = velocity;
    	System.out.println("Moving at speed " + 
    	this.currentVelocity
    	+" and at  " + this.currentDirection + " degree.");
    }
    public void stop(){
    	this.currentVelocity = 0;
    }
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public int getCurrentDirection() {
		return currentDirection;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}


    

}
