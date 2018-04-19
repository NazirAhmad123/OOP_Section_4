package pckg;



public class ProgrammingBooks {
	
	private String name;
	
	ProgrammingBooks(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void description(){
		System.out.println("nothing here.");
	}
}
class CodeComplete extends ProgrammingBooks {
	
	CodeComplete(){
		super("Code Complete");
	}
	public void description(){
		System.out.println("Code Complete is a software development book.");
	}
}
class LearningPython extends ProgrammingBooks {
	LearningPython(){
		super("Learning Python");
	}
	public void description(){
		System.out.println("Google and YouTube use Python because it's highly adaptable.");
	}
}
class LearnToProgram extends ProgrammingBooks{
	LearnToProgram(){
		super("Learn To Program");
	}
	public void description(){
		System.out.println("It's now easier to learn to write your own computer.");
	}
}
class CppPrimer extends ProgrammingBooks {
	CppPrimer(){
		super("C++ Primer");
	}
	public void description(){
		System.out.println("C++ Primer, Third Edition.");
	}
}
class JavaScript extends ProgrammingBooks {
	JavaScript(){
		super("JavaScript");
	}
//	No method description here.
//	We'll see why later.
}
