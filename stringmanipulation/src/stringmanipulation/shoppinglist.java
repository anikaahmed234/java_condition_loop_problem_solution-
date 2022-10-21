package stringmanipulation;

import java.util.Scanner;

public class shoppinglist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shirt Price");
		int Shirtprice = sc.nextInt();
		System.out.println("Quantity of Shirt");
		int Shirtqty = sc.nextInt();
		System.out.println("Enter Sharee Price");
		int Shareeprice = sc.nextInt();
		System.out.println("Quantity of Sharee");
		int Shareeqty = sc.nextInt();
		int totalcost = (Shirtprice * Shirtqty) + (Shareeprice * Shareeqty);
		if (Shirtqty == 2 && Shareeqty ==1)
		{
			int discount = 400;
			totalcost = totalcost - discount; 
			
		}
		System.out.println("Your total purchase cost is : " + totalcost);

	}

}
//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?