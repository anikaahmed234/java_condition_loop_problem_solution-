package stringmanipulation;

public class firstletterupperclass {

	public static void main(String[] args) {
		String str = "rahim lives in sylhet";
		String[] arr = str.split(" ");
//		for(String val: arr) {
//		    System.out.print(val + "_");
//		}
		// rahim
		// 01234
		int i, ch;
		for (i = 0; i < arr.length; i++) {
			int m = i;
			System.out.print(arr[1]);

			char[] abl = arr.toCharArray();
			System.out.print(abl[0]);

			if (i == 0) {
				if (abl[i] >= 97 || abl[i] <= 122) {
					ch = abl[0] - 32;
					char c = (char) ch;
				//	System.out.print(c);
				}
			} else if (i > 0) {
				for (i = 1; i < abl.length; i++) {
				//	System.out.print(abl[i]);
				}
			}
			i = m;
		}
	}
}

//8. Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet