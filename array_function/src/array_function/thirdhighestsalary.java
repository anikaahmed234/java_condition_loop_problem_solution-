package array_function;

import java.util.Arrays;

public class thirdhighestsalary {

	public static void main(String[] args) {

		int i, j = 0;
		int count = 0;
		int[] ar = { 30000, 25000, 28000, 32500, 44000, 32800 };
		int value, tmax = ar[0];
		Arrays.sort(ar);
//		for (int num : ar) {
//			System.out.print(num + " ");
//		}
		int f = ar.length;
		System.out.println("3rd Highest salary is " + ar[f - 3]);
	}
}

//3. Suppose, in a company, here are some employee salaries in an array, [35000, 25000, 28000, 32500, 44000, 32800]. Find out the 3rd highest salary.