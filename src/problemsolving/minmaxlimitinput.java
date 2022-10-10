//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
package problemsolving;
import java.util.Scanner;

public class minmaxlimitinput {
	
	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		//char c = 'q';
		int num;
		int max =0, min =0;
		try {
			do 
			{
				num = sc.nextInt();
				if(max < num)
				{
					max = num;
				}
				else				
				{
					min = num;
				}
			} while (num != 113);
			sc.close();
		} 
		catch (Exception e) {
			System.out.println("terminated");
		}
		System.out.println("The largest number is: " +max);
		System.out.println("The smallest number is: " +min);
	}

}