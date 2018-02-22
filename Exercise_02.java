package class_01_sec_04;

import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the # of students: ");
		int numOfStudents = userInput.nextInt();

//		Student 1 has the highest score
		System.out.println("Enter a name: ");
		String student1_name = userInput.next();

		System.out.println("Enter a score: ");
		int student1_score = userInput.nextInt();

//		Student 2 has the second highest score
		System.out.println("Enter a name: ");
		String student2_name = userInput.next();

		System.out.println("Enter a score: ");
		int student2_score = userInput.nextInt();


//		We have to make sure student 1 has the highest mark

		if (student1_score < student2_score){

			String tempName = student1_name;
			int tempScore = student1_score;

			student1_name = student2_name;
			student1_score = student2_score;

			student2_name = tempName;
			student2_score = tempScore;
		}

		for (int i=0; i<numOfStudents-2; i++){

			System.out.println("Enter a name: ");
			String newStudent_name = userInput.next();

			System.out.println("Enter a score: ");
			int newStudent_score = userInput.nextInt();

			if (newStudent_score > student1_score){
				student1_name = student2_name;
				student1_score = student2_score;

				student2_name = newStudent_name;
				student2_score = newStudent_score;
			}
			else if (newStudent_score > student2_score){
				student2_name = newStudent_name;
				student2_score = newStudent_score;
			}
		}
		System.out.println("Top two students are: ");
		System.out.println(student1_name + "'s score is " + student1_score);
		System.out.println(student2_name + "'s score is " + student2_score);
	}
}
