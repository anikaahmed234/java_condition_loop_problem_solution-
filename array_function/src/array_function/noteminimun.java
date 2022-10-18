package array_function;

import java.util.Scanner;

public class noteminimun {

	public static void main(String[] args) {
		System.out.println("Enter an amount : ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int[] arr = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int[] cc = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int i, v;
		boolean c = true;
		while (c != false) {
			for (i = 0; i < arr.length; i++) {
				if (value == 0) {
					c = false;
					break;
				} else {
					v = value / arr[i];
					value = value % arr[i];

					if (v > 0) {
						cc[i] = v;
					}

				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			if (cc[i] > 0) {
				System.out.println(arr[i] + " Note : " + cc[i]);
			}

		}
	}
}
//
//2. Input an amount from the user and find out the number of notes from input amount in given array
//[1000,500,100,50,20,10,5,2,1].
//Input: 1256
//
//Output: 
//1000 1
//100 2
//50 1
//2 3