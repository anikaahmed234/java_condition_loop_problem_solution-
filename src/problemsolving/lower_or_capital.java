//1. Write a program to check if inputted letter is small or capital.

package problemsolving;

import java.util.Scanner;

public class lower_or_capital {
	public static void main(String[] args) {
		System.out.println("Hello! Enter a letter ");
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		sc.close();
		try {
			if (letter >= 65 && letter <= 90) {
				System.out.println("Capital Letter");
			}

			else if (letter >= 97 && letter <= 122) {
				System.out.println("Lower Letter");
			}
			else 
			{
				System.out.println("Enter from A-Z or a-z");
			}
		} catch (Exception e) {
			System.out.println("Enter a letter that is in range of either A-Z or a-z");
		}

	}
}
