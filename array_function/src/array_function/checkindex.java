package array_function;

import java.util.Scanner;

public class checkindex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int value = sc.nextInt();
		int i;
		int count = 0;
		int ar[] = { 1, 3, 5, 7, 2, 4, 6, 8 };
		for (i = 0; i < ar.length; i++) {
			if (ar[i] == value) {
				System.out.println(value +" found in the index of "+i);
				count++;
			} 
		}
		if (count == 0) {
			System.out.println("Found no element!");
		}

	}

}

//1. Take input from a user and check if the number exists in the array.
//Let the array is [1,3,5,7,2,4,6,8]
//Input: 7
//Output: Found in the position 3