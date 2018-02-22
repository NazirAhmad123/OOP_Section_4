package class_01_sec_04;

import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the # of rows: ");
		int rows = userInput.nextInt();
		int numbers = 0;
		for (int i=1; i<rows; i++){

//			spaces
			for (int space = 1; space <= (rows-i); space++){
				System.out.print("  ");
			}

			while (numbers <= (2*i-1)){
				System.out.print("* ");
				numbers++;
			}
			numbers = 0;
			System.out.println();
		}
	}
}
