//2. Write a program according to the following output:

package problemsolving;

import java.util.Scanner;
import java.lang.Math;

public class guessinggame {

	public static void main(String[] args) {

		System.out.println("********************Welcome to the Guessing Game!********************\r\n"
				+ "********************A number is already generated.********************\r\n\n"
				+ "*******To win, you have 5 chances to guess the generated number.*******\n");

		int min = 0, max = 100, count = 0, flag =0;
		int random = min + (int) (Math.random() * max);
		//System.out.println("random number is " + random);
		while (count !=5) {
			System.out.println("Please, enter an Integer value that you can guess, between 1 to 100:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			count++;

			if (random == num) {
				flag = 1;
				System.out.println("Great! You have guessed the correct number.");
				System.out.print("Congratulation!! You won!!\r\n");

			} else if (random < num) {
				System.out.println("Your input is higher than the generated number.");

			} else if (random > num) {
				System.out.println("Your input is lower than the generated number.");

			}
		}
	}

}

//
//********************Welcome to the Guessing Game! ********************
//********************A number is already generated. ********************
//*****To win, you have 5 chances to guess the generated number. *****
//
//Please, enter an Integer value that you can guess, between 1 to 100: 56 (User input)
//Your input is higher than the generated number.
//
//Please, enter an Integer value that you can guess, between 1 to 100: 23 (User input)
//Your input is higher than the generated number.
//
//Please, enter an Integer value that you can guess, between 1 to 100: 10 (User input)
//Your input is lower than the generated number.
//
//Please, enter an Integer value that you can guess, between 1 to 100: 21 (User input)
//Your input is higher than the generated number.
//
//Please, enter an Integer value that you can guess, between 1 to 100: 20 (User input)
//Great! You have guessed the correct number.
//
//Congratulation!! You win!!