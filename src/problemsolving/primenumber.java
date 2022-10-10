//7. Write a program to print prime numbers from 2 to n.
package problemsolving;
import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		System.out.println("Enter number to find prime numbers : ");
		Scanner sc = new Scanner(System.in);
		int i, p;
		p = sc.nextInt();
		int m = p / 2;
		int count = 0;
		if (p == 1 || p == 0) {
			count++;
			System.out.println("not prime");
		} else if (p > 1) {
			for (i = 2; i <= m; i++) {
				if (p % i == 0) {
					count++;
					System.out.println("not prime");
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("prime");
		}
	}
}
