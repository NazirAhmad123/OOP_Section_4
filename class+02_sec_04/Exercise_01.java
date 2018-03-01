package claa_02;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		System.out.println("Sum of the digits: "+sumOfDigits(num));
		System.out.println("Sum of the first and last digit: "+sumOfFirstAndLast(num));
		System.out.println("Sum of the odd digits: "+sumOfOdds(num));
		System.out.println("Sum of the odd digits: "+sumOfEvens(num));
		rev(num);
		System.out.println("Revers of " + num + " is " + rev1(num) );
		System.out.println("The smallest digit is: "+smallestDigit(num));
		//System.out.println("The smallest digit is: "+smallestDigit(num));
		System.out.println("The largest digit is: "+largestDigit(num));
		
		
		// Sum of all the digits
		// Sum of the first and last
		// Sum of all the odd digits
		// Sum of all the even digits
		// The smallest digit
		// The largest digit
		//The reverse of the number
	}
	public static int sumOfDigits(int num){
		int sum = 0;
		while(num != 0){
			int remainder = num%10;
			sum+=remainder;
			num/=10;
		}
		return sum;
	}
	public static int sumOfFirstAndLast(int num){
		int sum;
		// last digit
		int ld = num%10;
		
		int rev=0;
		while(num!=0){
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		// first digit
		int fd = rev%10;
		sum = ld+fd;
		return sum;
	}
	public static int sumOfOdds(int num){
		int sum=0;
		while(num>0){
			int rem= num%10;
			if(rem % 2 != 0){
				sum+=rem;
			}
			num/=10;
		}
		return sum;
	}
	public static int sumOfEvens(int num){
		int sum=0;
		while(num>0){
			int rem= num%10;
			if(rem % 2 == 0){
				sum+=rem;
			}
			num/=10;
		}
		return sum;
	}
	public static void rev(int num){
		while(num!=0){
			int rem = num%10;
			System.out.print(rem);
			num/=10;
		}
		System.out.println();
	}
	public static int rev1(int num){
		int rev =0;
		while(num!=0){
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public static int smallestDigit(int num){
		int min = 9;
		while(num!=0){
			int rem = num%10;
			if(rem < min){
				min = rem;
			}
			num/=10;
		}
		return min;
	}
	public static int smallestDigit2(int num){
		// assume this as minimum
		int min = num%10;
		while(num!=0){
			int rem = num%10;
			if(rem < min){
				min = rem;
			}
			num/=10;
		}
		return min;
	}
	public static int largestDigit(int num){
		// assume this as minimum
		int min = num%10;
		while(num!=0){
			int rem = num%10;
			if(rem > min){
				min = rem;
			}
			num/=10;
		}
		return min;
	}
}
