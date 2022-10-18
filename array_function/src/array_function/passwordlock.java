package array_function;

import java.util.Scanner;

public class passwordlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] ar = new String[100];
		int i, count =0;
		String b = "adm1n";
		System.out.println("Enter Password: ");
		for(i =0;i<3;i++)
		{
			ar[i]=sc.next();  
			if (ar[i].equals(b))
			{
				System.out.println("Successful Login!");
				break;
			}
			else
			{
				count++;
			}
		}
		if (count >=3)
		{
			System.out.println("Your user has been temporary locked");	
		}
	}

}
//6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n