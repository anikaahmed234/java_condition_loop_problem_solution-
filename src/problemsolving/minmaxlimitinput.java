//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
package problemsolving;

import java.util.Scanner;

public class minmaxlimitinput {

	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		String numm;
		int max = 0, min =0;
		int num;
		try {
			do {
				numm = sc.next();
				if (numm != "q") {
					num = Integer.valueOf(numm);  
					if (max < num) {
						max = num;
					} else {
						if(min == 0)
						{
							if(num<max)
							{
								min = num;
							}
			
						}
						else if (min > num)
						{
							min = num;
						}
						
						
					}
				}
			} while (numm != "q");
			sc.close();
		}
		catch (Exception e) {
			System.out.println("terminated");
		}
		System.out.println("The largest number is: " + max);
		System.out.println("The smallest number is: " + min);
	}

}