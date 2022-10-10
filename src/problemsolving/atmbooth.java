//4. Write a program to check your balance, deposit balance and withdraw balance from ATM booth.

package problemsolving;

import java.util.Scanner;

public class atmbooth {

	public static void main(String[] args) {
		System.out.println("Choose any: \n");
		System.out.println("1. Deposit");
		System.out.println("2. Check Balance");
		System.out.println("3. Withdraw");
		int min = 1000, max = 100000;
		int random = min + (int) (Math.random() * max);
//		System.out.println(random + "\n");

		Scanner sc = new Scanner(System.in);
		int dig = sc.nextInt();

		switch (dig) {
		case 1:
			System.out.println("Please enter deposit amount: ");
			int depo = sc.nextInt();
			int balance1 = depo + random;
			System.out.println("After deposit your account balance is: " + balance1);
			break;
		case 2:
			System.out.println("Your account balance is: " + random);
			break;
		case 3:

			System.out.println("Please enter withdrawal amount: ");
			int withdraw = sc.nextInt();
			int balance = random - withdraw;
			System.out.println("After withdrawal your account balance is : " + balance);
			break;

		default:
			System.out.println("Choose 1,2 or 3");
		}

	}
}
