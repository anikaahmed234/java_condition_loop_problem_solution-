package problemsolving;

import java.util.Scanner;

public class twodigitdecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal numbers ");

		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();

		String a = String.format("%.02f", num1);
		String b = String.format("%.02f", num2);

		System.out.println(a + "\n" + b);

		if (a.compareTo(b) == 0) {
			System.out.println("The numbers are same.");
		}

		else if (a.compareTo(b) == 1) {
			System.out.println("The numbers are not same.");
		}

	}

}