package stringmanipulation;

import java.util.Scanner;

public class replaceletter {
	public static void main(String[] args) {

		String str = "Ratul and Rahim live in Rangpur";
		String[] arr = new String[6];
		arr = str.split(" ");
		int i;
		String q = "Rahim";
		for (i = 0; i < arr.length; i++) {
			String m = arr[i];
			if (m.equals(q)) {
				str = arr[i];
				char[] abl = str.toCharArray();
				StringBuilder string = new StringBuilder(str);
				int index = 10;
				char qq = 'F';
				string.setCharAt(index, qq);
				System.out.print("open ");

				for (i = 0; i < abl[i]; i++) {
					System.out.print(abl[i]);

				}
			} else {
				System.out.print(arr[i] + " ");

			}

		}

	}
}

//6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim live in Rangpur
//Output: Ratul and Fahim lives in Rangpur