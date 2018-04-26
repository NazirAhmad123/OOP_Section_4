package abst_;

import java.util.Scanner;

interface MR_Robot {
	public abstract void sing();
	
}
abstract class Robot { // Abstract class
	private String name;
	// Create a simple calculator -> +,-,*,/,%
	// Create an abstract class with 4 abstract methods
	// Create another class that extends this class
	// and implements all the abstract methods.
	// in your main method-> ask for two integers.
	// lastly, do the all the operations for that 2 ints.
	Robot(String name){
		this.name = name;
	}
	public void walk(){
		System.out.println("Walking...");
		
	}
	public abstract void talk();
	public abstract void sleep();
	public abstract void eat();
}
abstract class RobotV2 extends Robot {
	
	RobotV2(){
		super("rb");
	}
	public void talk(){
		System.out.println("Talking...");
	}
}
class Robotv3 extends RobotV2 implements MR_Robot{ // Concrete class
	Robotv3(){
		super();
	}
	
	public void sleep(){
		System.out.println("Sleeping...");
	}
	public void eat(){
		System.out.println("Eating...");
		
	}
	
	public void sing(){
		System.out.println("Singing...");
		
	}
}
public class Main {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		
//		Robot rb = new Robotv3();
//		rb.walk();
//		rb.eat();
//		rb.talk();
//		rb.sleep();
//		Robotv3 rb1 = new Robotv3();
//		rb1.sing();
//		System.out.print("Enter two integers: ");
//		int a = in.nextInt();
//		int b = in.nextInt();
		Calculator calc = new Calculate();
//		//System.out.println("Addition: " + calc.add(a, b));
//		System.out.println(a+" + " + b + ": " +calc.add(a, b));
//		System.out.println(a+" - " + b + ": " +calc.sub(a, b));
//		System.out.println(a+" * " + b + ": " +calc.mul(a, b));
//		System.out.println(a+" / " + b + ": " +calc.div(a, b));
//		System.out.println(a+" % " + b + ": " +calc.rem(a, b));
	
		Telephone myPhone = new DeskPhone(12345);
		myPhone.powerOn();
		myPhone.dialNumber(12345);
		myPhone.call(12345);
		myPhone.answer(12345);
		calc.sayHi();
		
	}

}
