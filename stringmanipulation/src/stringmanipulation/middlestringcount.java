package stringmanipulation;

//4. Write a program that will give following output:
//Input: Chattogram
//Output: C8M

import java.util.Scanner;

public class middlestringcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int flag = 0, i;
		char[] abl = str.toCharArray();
		for (i = 0; i < str.length(); i++) {
			if (i != 0 && i != str.length()) {
				flag++;
			}
		}
		char c, c1;
		int len = str.length();
		c = Character.toUpperCase(abl[0]);
		System.out.print(c);
		System.out.print(flag - 1);
		c1 = Character.toUpperCase(abl[len - 1]);
		System.out.print(c1);

	}
}
