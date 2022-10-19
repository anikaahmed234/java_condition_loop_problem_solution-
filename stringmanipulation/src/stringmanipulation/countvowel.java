package stringmanipulation;

import java.util.Scanner;

public class countvowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String vowel = sc.nextLine();
		char[] vwl = vowel.toCharArray();
		int i;
		int count = 0;
		for (i = 0; i < vowel.length(); i++) {

			if (vwl[i] == 'a' || vwl[i] == 'e' || vwl[i] == 'o' || vwl[i] == 'i' || vwl[i] == 'u') {
				count++;
			}
		}
		System.out.print("Vowel found: " + count);

	}

}
