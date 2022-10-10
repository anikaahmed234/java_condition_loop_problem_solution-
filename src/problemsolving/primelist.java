//7. Write a program to print prime numbers from 2 to n.
package problemsolving;

import java.util.Scanner;

public class primelist {
	public static void main(String[] args) {
		System.out.println("Enter number to find prime numbers : ");
		Scanner sc = new Scanner(System.in);
		int i,j, p;
		int c = 0;
		p = sc.nextInt();
		for(i=1;i<=p;i++)
		{ 
			if(p%i==0)
			{
				c++;
			}
			if(c==2)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");

			}
		}		
	}
}
