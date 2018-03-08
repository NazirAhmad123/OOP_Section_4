import java.util.Scanner;

public class New_Exercise {
	public static void main(String[] args) {
		//System.out.println("Hi");
		Scanner input = new Scanner(System.in);
		int[] scores  = new int[20];
		// Write a program that takes an unlimited number 
		// of scores from the user
		int newScore, count=0, sum=0;
		do {
			System.out.print("Enter new score: ");
			newScore = input.nextInt();
			
			if(newScore >0){
				scores[count] = newScore;
				sum+=newScore;
				count++;
			}
		}while(newScore>0);
		
		double average = sum/count;
		int numOfScoreAboveAverage=0, numOfScoreBelowAverage=0;
		
		for(int i=0; i<count; i++){
			if(scores[i] > average){
				numOfScoreAboveAverage++;
			}else {
				numOfScoreBelowAverage++;
			}
			// public static int minElement(int[] array){}
			// public static int minElement(int[] array){}
			// public static int minIdex(int[] array){}
			// public static int maxIndex(int[] array){}
		}
		System.out.println("The number of scores entered: " + count);
		System.out.println("Average is: " + average);
		System.out.println("Scores above average: " + numOfScoreAboveAverage);
		System.out.println("Scores below average: " + numOfScoreBelowAverage);
		
		// Max of 20  int[] scores  = new int[20];
		// Finish the program with a negative number
		
		
		
		// Find the average of the scores entered
		// Find the number of scores above the average
		// Find the number of scores below the average
	}

}
