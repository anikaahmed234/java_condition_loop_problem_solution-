// 9. Write a program to sum of user input until users input ‘q’ from keyboard.

package problemsolving;

import java.util.Scanner;

public class inputlimit {

	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		char c = 'q';
		int num;
		try {
			do {
				num = sc.nextInt();
				if (num == c) {
					break;
				}
			} while (num != c);
			sc.close();

		} catch (Exception e) {
			System.out.println("terminated");

		}

	}

}
