package array_function;

import java.util.HashMap;
import java.util.Scanner;

public class bazarlist {
	public static int searchItem(String a) {
		int price = 0;
		HashMap<String, Integer> item = new HashMap<String, Integer>();
		item.put("Capsicum", 240);
		item.put("Eggplant", 190);
		item.put("Flour", 120);
		item.put("Corn-Flakes", 500);
		int c = 0;
		for (String i : item.keySet()) {
			if (a.equals(i)) {
				price = item.get(i);
				c++;
			}
		}
		if (c == 0) {
			System.out.println("No Item Found");
		}
		int b = 0;
		for (String i : item.keySet()) {
			int val = item.get(i);
			b = totalSum(val, b);
		}
		System.out.println("Total Value of items: " + b);
		return price;
	}

	public static int totalSum(int val, int dec) {
		dec = dec + val;
		return dec;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an item: ");
		String a = sc.next();
		int price = searchItem(a);
		if (price > 0) {
			System.out.println(a + " price is " + price);
		}

	}
}

//. Create your todays shopping list/pocket expenditure which includes the item name and price. 
//Then create a function named searchItem(String item) which will be used to search any item from 
//your HashMap and return the price. If found no item, then print message as "No item found" and 
//create another function named totalSum() which will return total price of items.
