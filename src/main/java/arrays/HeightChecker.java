package arrays;

import java.util.Arrays;

/*
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation: 
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 * 
 */
public class HeightChecker {

	public static void main(String[] args) {

		int[] a = { 1, 2, 1, 2, 1, 1, 1, 2, 1 };

		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		int j = a.length - 1;
		for (int i = 0; i < a.length;) {

			if (i == j) {
				break;
			}

			System.out.printf("Comparing %d == %d \n", a[i], a[j]);
			if (a[i] == a[j]) {
				j--;
			} else if (a[i] > a[j]) {
				System.out.printf("Swapping %d and %d\n", a[i], a[j]);
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
				i++;
			} else {
				i++;
			}

		}

		System.out.println(Arrays.toString(a));

		int check = 0;
		for (int c = 0; c < a.length; c++) {
			if (b[c] != a[c]) {
				check++;
			}
		}

		System.out.println("Wrong indices " + check);

	}
}
