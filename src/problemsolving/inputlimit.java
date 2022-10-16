// 9. Write a program to sum of user input until users input ‘q’ from keyboard.

package problemsolving;

import java.util.Scanner;

public class inputlimit {

	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		String numm;
		int num = 0;
		int sum = 0;
		boolean c = true;
		try {
			do {
				numm = sc.next();
				if (numm != "q") {
					num = Integer.parseInt(numm);
					if (num != 'q') {
						sum += num;
					} else {
						c = false;
					}
				}
			} while (c != false);
		
			sc.close();
		} catch (Exception e) {
			System.out.println("Summation on all given input are: " + sum);
			System.out.println("terminated");
		}
	}
}
