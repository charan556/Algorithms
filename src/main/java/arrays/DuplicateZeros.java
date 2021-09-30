package arrays;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] input = { 1, 0, 2, 0, 3, 0, 4, 0 };
		duplicateZero(input);
	}

	public static void duplicateZero(int[] arr) {

		int zeroes = 0;
		for (int i : arr) {
			if (i == 0) {
				zeroes++;
			}
		}
		int i = arr.length - 1;
 		int j = arr.length + zeroes - 1;

		while (i != j) {
			insert(arr, i, j--);
			if (arr[i] == 0) {
				insert(arr, i, j--);
			}
			i--;
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void insert(int[] arr, int i, int j) {
		if (j < arr.length) {
			arr[j] = arr[i];
		}
	}

	public static void duplicateZeros(int[] arr) {

		System.out.println(Arrays.toString(arr));
		int possibleDups = 0;
		int length_ = arr.length - 1;

		for (int left = 0; left <= length_ - possibleDups; left++) {

			System.out.println("left: " + left + " length-possibledups: " + (length_ - possibleDups));
			// Count the zeros
			if (arr[left] == 0) {
				System.out.print("\t When left: " + left + " found value 0");
				// Edge case: This zero can't be duplicated. We have no more space,
				// as left is pointing to the last element which could be included
				if (left == length_ - possibleDups) {
					// For this zero we just copy it without duplication.
					arr[length_] = 0;
					length_ -= 1;
					break;
				}
				possibleDups++;
				System.out.print("\t Possible dup: " + possibleDups + "\n");
			}
		}

		// Start backwards from the last element which would be part of new array.
		int last = length_ - possibleDups;

		// Copy zero twice, and non zero once.
		for (int i = last; i >= 0; i--) {
			if (arr[i] == 0) {
				arr[i + possibleDups] = 0;
				possibleDups--;
				arr[i + possibleDups] = 0;
			} else {
				arr[i + possibleDups] = arr[i];
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
