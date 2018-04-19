package pckg;


class Main{
	public static void main(String[] args) {
		
		
		for(int i=1; i<11; i++){
			ProgrammingBooks pbooks = randomProgrammingBooks();
			System.out.println("Books#: " + i);
			System.out.println("Name: " + pbooks.getName());
			System.out.print("Description: ");
			pbooks.description();
		}
		
	}
	public static ProgrammingBooks randomProgrammingBooks(){
		int randomNumbers = (int)(Math.random()*5)+1;
		System.out.println("Random number generated is: " + randomNumbers);
		
		switch(randomNumbers) {
		case 1:
			return new CodeComplete();
		case 2:
			return new LearningPython();
		case 3:
			return new LearnToProgram();
		case 4:
			return new CppPrimer();
		case 5:
			return new JavaScript();
		}
		return null;
	
	}
}