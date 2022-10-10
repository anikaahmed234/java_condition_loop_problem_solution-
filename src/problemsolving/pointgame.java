package problemsolving;

import java.util.Scanner;

public class pointgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10;
		int flag = 0, i;
		int max = 99999;

		for (i = 0; i < 10; i++) {
			int random1 = min + (int) (Math.random() * max);
			int random2 = min + (int) (Math.random() * max);
//			System.out.println(random1 );
//			System.out.println(random2 );
			System.out.println("Enter new number: ");
			int userinput = sc.nextInt();

			if (userinput == random1 || userinput == random2) {
				flag++;
				System.out.println("User gets " + flag + " point!");

			} else {
				System.out.println("He does not get any point!");
			}

		}

	}
}