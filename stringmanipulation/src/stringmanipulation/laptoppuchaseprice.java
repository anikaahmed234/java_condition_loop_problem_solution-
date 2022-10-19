package stringmanipulation;

import java.util.Scanner;

public class laptoppuchaseprice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Laptop Price: ");
		int price = sc.nextInt();
		System.out.println("Enter Cash payment discount amount: ");
		int discount = sc.nextInt();
		int purchase_price ;
		purchase_price = price - (price * discount/100);
		System.out.println("Laptop purchase price is: " + purchase_price);
	}

}
//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
