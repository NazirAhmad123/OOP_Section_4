import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		int[] list = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + list.length + " numbers: ");
		for(int i=0; i<list.length; i++){
			list[i] = input.nextInt();
		}
		System.out.println("Minimum element in the list: [" + minElement(list)+"]");
		System.out.println("Minimum Index: [" + minIdex(list)+"]");
		System.out.println("Maximum element is: [" + maxElement(list)+"]");

		System.out.println("Maximum index is: [" + maxIndex(list)+"]");
	}
	public static int minElement(int[] array){
		int min = array[0];
		for(int i=0; i<array.length; i++){
			if(array[i] < min){
				  min=array[i];
			}
			
		}return min;
	}
	public static int minIdex(int[] array){
		int min = array[0];
		int minIdex=0;
		for(int i=0; i<array.length; i++){
			if(array[i] < min){
				  min=array[i];
				  minIdex = i;
			}
			
		}return minIdex;
		
	}
	public static int maxElement(int list[]){
		int max=list[0];
		
		for(int i=0; i<list.length; i++){
			if(list[i]>max){
				max=list[i];
			
			}
		}
		return max;
	}
	public static int maxIndex(int list[]){
		int max=list[0];
		int maxIndex=0;
		
		for(int i=0; i<list.length; i++){
			if(list[i]>max){
				max=list[i];
				maxIndex=i;
			
			}
		}
		return maxIndex;
	}
	
}

	
//	public static int maxElement(int[] array){
//		
//	}
//	
//	public static int minIdex(int[] array){
//		
//		
//	}
//
//}
