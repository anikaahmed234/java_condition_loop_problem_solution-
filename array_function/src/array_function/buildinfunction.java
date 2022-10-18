package array_function;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class buildinfunction {

	public static void average(int ar[]) {
		int i,sum=0;
		for (i = 0; i <ar.length; i++) {
				sum+=ar[i];
		}
		int len = ar.length;
		double avg =sum/len;
		System.out.println("Average " + avg);
	
	}

	public static void countEvenNumbers(int ar[]) {
		int c = 0, i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				c++;
			}

		}
		System.out.println("Even number are : " + c);
	}

	public static void countOddNumbers(int ar[]) {
		int c1 = 0, i;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] % 2 != 0) {
				c1++;
			}
		}
		System.out.println("Odd number are : " + c1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int [5];
		int i;
		System.out.println("Enter 5 values: " + " ");
		for (i = 0; i < 5; i++) {
			ar[i] = sc.nextInt();
		}
		average(ar);
		countEvenNumbers(ar);
		countOddNumbers(ar);
	}

}

//5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers().
//10, 2, 38, 23, 38