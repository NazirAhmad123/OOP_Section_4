import java.util.Scanner;

public class WExercise_03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] list = new int[10];
		int numOfdist=0;
		
		System.out.println("Enter " + list.length + " numbers: ");
	
		for(int i=0; i<list.length; i++){
			int number = in.nextInt();
			
			boolean isInTheArray = false;
			
			for(int j=0; j<list.length; j++){
				if(number == list[j]){
					isInTheArray = true;
				}
			}
			if(!isInTheArray){
				list[numOfdist] = number;
				numOfdist++;
			}
		}
		// output the result
		System.out.print("Unique elements are: ");
		for(int k=0; k<numOfdist; k++){
			System.out.print(list[k] + "  ");
		}
		
		
	}

}
