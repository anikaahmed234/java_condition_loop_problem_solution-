package problemsolving;

import java.util.Scanner;

public class pointgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10;
		int flag = 0, i;
		int max = 99;

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
		System.out.println("Your total point is "+flag+"!");


	}
}
//
//
//8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the total points user achieved at the end of 10 cycle.
//
//To help you understand the problem, here is the explanation.
//
//In the first cycle, generated random numbers are 3, 19. (This generated numbers will not be shown to anyone)
//User inputs 4
//He does not get any point.
//
//In the second cycle, generated random numbers are 15, 7. (This generated numbers will not be shown to anyone)
//User inputs 7
//User gets 1 point.
//
//This process will be continued for 10 times. And finally, the total points are achieved by the user will be printed, like
//
//Your total point is 7!