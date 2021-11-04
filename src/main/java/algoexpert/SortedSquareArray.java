package algoexpert;

import java.util.Arrays;

public class SortedSquareArray {
	public static int[] sortedSquaredArray(int[] array) {

		System.out.println("INPUT: " + Arrays.toString(array));

		int[] sortedSquares = new int[array.length];

		int i = 0;
		int j = array.length - 1;

		for (int idx = j; idx >= 0; idx--) {
			int minVal = array[i];
			int maxVal = array[j];

			System.out.printf("COMPARING: %d, %d\t", minVal, maxVal);
			if (Math.abs(minVal) > Math.abs(maxVal)) {
				sortedSquares[idx] = minVal * minVal;
				System.out.printf("INSERT %d at %d index", minVal, idx);
				i++;
			} else {
				sortedSquares[idx] = maxVal * maxVal;
				System.out.printf("INSERT %d at %d index", maxVal, idx);
				j--;
			}
			System.out.println();
		}

		return sortedSquares;
	}

	public static void main(String[] args) {
//		int[] input = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int[] input = { -5, -4, -3, 1, 2 };
		System.out.println(Arrays.toString(sortedSquaredArray(input)));
	}
}
