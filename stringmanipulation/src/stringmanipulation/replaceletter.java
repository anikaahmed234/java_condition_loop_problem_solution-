package stringmanipulation;

//6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim live in Rangpur
//Output: Ratul and Fahim lives in Rangpur

public class replaceletter {
	public static void main(String[] args) {

		String str = "Ratul and Rahim live in Rangpur";
		String[] arr = new String[6];
		arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("Rahim")) {
				String mm = arr[i].replace("Rahim", "Fahim");
				arr[i] = mm;
				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i]+ " ");

				}		
			}
		}
		
	}
}
		

	