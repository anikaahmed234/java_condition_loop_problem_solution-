//6. Write a program to find the factorial of a given number.

package problemsolving;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		System.out.println("Hello! Enter a Number to find out it's factorial value: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i;
		double fac = 1l;
		for (i = number; i > 0; i--) {

			fac = i * fac;
		}

		System.out.println(fac);
	}
}
