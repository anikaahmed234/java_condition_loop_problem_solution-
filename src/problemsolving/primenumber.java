//7. Write a program to print prime numbers from 2 to n.
package problemsolving;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		System.out.println("Enter number to find prime numbers : ");
		Scanner sc = new Scanner(System.in);
		int i, p;
		p = sc.nextInt();
		//int m = p / 2;
		int n =0;
		int[] arr = new int [n];
		int count = 0;
		int j=0;
		if (p == 1 || p == 0) {
			System.out.println("not prime");
		}
		else {
			for (i = 2; i <= p; i++) {
				if (p % i == 0) {
					count++;
					System.out.println("not prime");
					break;
				} else {
					arr[j] = i;
					j++;
				}
			}
			n = j;
			System.out.println(n);

			if (count == 0) {
				System.out.println("prime");
				for (i = 0; i <n; i++) {
					System.out.println(arr[i]);

				}
			}
		}

	}
}
