package Polymorphuism;

class Animal {
	private String name;
	
	Animal(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	public void move(){
		System.out.println("Nothing here.");
	}
}

class Elephant extends Animal {
	
	Elephant(){
		super("Elephant");
	}
	public void move(){
		System.out.println("I am an elephant, I walk slowly.");
	}
}

class Turtule extends Animal {
	
	Turtule(){
		super("Turtule");
		
	}
	public void move(){
		System.out.println("I am an turtle, I walk very slowly.");
	}
}

class Lion extends Animal {
	
	Lion(){
		super("Lion");
	}
	public void move(){
		System.out.println("I am lion, I walk fast.");
	}
}

class Butterfly extends Animal {
	
	Butterfly(){
		super("Butterfly");
	}
	public void move(){
		System.out.println("I am Butterfly, I fly.");
	}
}
class Monkey extends Animal {
	
	Monkey(){
		super("Monkey");
	}
	public void move(){
		System.out.println("I am Butterfly, I jump.");
	}
}


public class Main {
	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.move();
//		Animal monkey = new Monkey();
//		monkey.move();
		
		Animal[] animals = new Animal[5];
		animals[0] = new Elephant();
		animals[1] = new Turtule();
		animals[2] = new Lion();
		animals[3] = new Butterfly();
		animals[4] = new Monkey();
		
		Animal lion = new Lion();
		IsItinstanceOfAnimal(lion);
		System.out.println(new Monkey() instanceof Animal);
		
		for(int i=0; i<animals.length; i++){
			animals[i].move();
		}
		
	}

	private static void IsItinstanceOfAnimal(Animal lion) {
		if(lion instanceof Animal){
			System.out.println(((Lion)lion).getName() + " is an animal.");
		}
		
	}

}
