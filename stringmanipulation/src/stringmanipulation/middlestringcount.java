package stringmanipulation;

import java.util.Scanner;

public class middlestringcount {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int count = 0, i;
		char[] abl = str.toCharArray();
		for (i = 0; i < str.length(); i++) {
			if (i != 0 && i != str.length()) {
				count++;
			}
		}
		int ch, chh;
		for (i = 0; i < str.length(); i++) {
			if (i == 0) 
			{
				if (abl[i] >= 97 || abl[i] <= 122) {
					ch = abl[i] - 32;
					char c = (char) ch;
					System.out.print(c);
				} else if (abl[i] >= 65 || abl[i] <= 90) {
					char c = abl[i];
					System.out.print(c);

				} else {
					System.out.print("Enter a valid string");

				}
			}
		}
		System.out.print(count - 1);
		i = i - 1;
		ch = abl[i] - 32;
		char c = (char) ch;

		System.out.print(c);
	}
}
//4. Write a program that will give following output:
//Input: Chattogram
//Output: C8M
