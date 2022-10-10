// 9. Write a program to sum of user input until users input ‘q’ from keyboard.

package problemsolving;

import java.util.Scanner;
//9. Write a program to sum of user input until users input ‘q’ from keyboard.

public class inputlimit {

	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		char num;
		boolean c = true;
		try {
			do {
				num = sc.next().charAt(0);
				if (num == 'q') {
					// System.out.println("Out");
					c = false;
					break;
				}

				else {
					continue;
				}

			} while (c == true);
			sc.close();

		} catch (Exception e) {
			System.out.println("terminated");
			System.out.println(e);

		}

	}

}
