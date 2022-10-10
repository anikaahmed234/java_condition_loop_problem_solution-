// 5. Write a program to sum of numbers which only divisible by 5 from 1 to 100.
package problemsolving;

import java.util.Scanner;

public class dividedbu5 {

	public static void main(String[] args) {

		System.out.print("Hello! Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int i, sum = 0;
		if (number > 0) {
			for (i = 0; i <= number; i++) {
				if (i % 5 == 0) {
					sum += i;
				}
			}
		} else {
			for (i = 0; i >= number; i--) {
				if (i % 5 == 0) {
					sum += i;
				}
			}
		}
		System.out.println("Sum of " + number + " that are dividable by 5 are: " + sum);
	}

}
