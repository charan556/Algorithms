package arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 0, 0, 0 };
		int[] b = { 2, 5, 6 };

		merge(a, 3, b, 3);
	}

	public static void merge(int[] a, int i, int[] b, int j) {

		while (i > 0 && j > 0) {
			if (a[i - 1] > b[j - 1]) {
				a[i + j - 1] = a[i - 1];
				i--;
			} else {
				a[i + j - 1] = b[j - 1];
				j--;
			}
		}

		while (j > 0) {
			a[i + j - 1] = b[j - 1];
			j--;
		}

		System.out.println(Arrays.toString(a));
	}
}
