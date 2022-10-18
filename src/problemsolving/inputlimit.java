// 9. Write a program to sum of user input until users input ‘q’ from keyboard.
package problemsolving;
import java.util.Scanner;
public class inputlimit {

	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		String numm ;
		int num =0;
		int sum = 0;
		try
		{
			do {	
			numm = sc.next();
			if(numm.equals("q"))
			{
				break;
			}
			else
			{
			num = Integer.valueOf(numm);
			sum += num;
			}
		} while (!numm.equals("q"));
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Summation of all given input: " + sum);
	}
}
