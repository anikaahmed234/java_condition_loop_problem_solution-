package array_function;

import java.util.Arrays;

public class duplicatevalue {

	public static void main(String[] args) {
		int i, j = 1, k, count = 0;
		int[] ar = { 1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5 };
		for (i = 0; i < ar.length; i++) {
			for (k = i+1; k < ar.length; k++) {
				if(ar[k]==0)
				{
					break;
				}
				if (ar[i] == ar[k]) {
					ar[k]=0;
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(ar[i]);
			}
			count = 0;
		}
	}

}
//7. Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5]
