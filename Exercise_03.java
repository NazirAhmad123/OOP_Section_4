package class_01_sec_04;

import java.util.Scanner;

public class Exercise_03 {
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the # of rows: ");
		int rows = userInput.nextInt();

		for (int i=1; i<rows; i++){
			for (int j=1; j<=i; j++){

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
