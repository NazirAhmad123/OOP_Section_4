package class_01_sec_04;

import java.util.Scanner;

public class Exercise_001 {
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the # number of students: ");
		int numOfStudents = userInput.nextInt();
//		Highest score
		System.out.println("Enter a name: ");
		String name_01 = userInput.next();

		System.out.println("Enter a score: ");
		int score_01 = userInput.nextInt();

		for (int i=0; i<numOfStudents-1; i++){

//			This is the new students
			System.out.println("Enter a name: ");
			String name = userInput.next();

			System.out.println("Enter a score: ");
			int score = userInput.nextInt();

			if (score > score_01){
				name_01 = name;
				score_01 = score;
			}
		}
		System.out.println(name_01 + "'s score is " + score_01);

	}
}
