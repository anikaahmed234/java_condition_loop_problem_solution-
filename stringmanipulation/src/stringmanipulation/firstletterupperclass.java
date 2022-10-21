package stringmanipulation;

//8. Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet

public class firstletterupperclass {

	public static void main(String[] args) {
		String str = "rahim lives in sylhet";
		String[] arr  = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char[] abl = arr[i].toCharArray();
			for (int j = 0; j < abl.length; j++) {
				if (j == 0) 
				{
					char c = Character.toUpperCase(abl[0]);
					abl[0] = c;
					System.out.print(abl[0]);

				}
				else
				{
					System.out.print(abl[j]);
				}

			}
			System.out.print(" ");

		}
	}
}
