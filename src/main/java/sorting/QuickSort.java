package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] input = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };

		int[] copy = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			copy[i] = input[i];
		}

		quickSort(input, 0, input.length - 1);

		int wrong = 0;
		for (int j = 0; j < input.length; j++) {
			if (copy[j] != input[j]) {
				wrong++;
			}
		}

		System.out.println("Wrong indices: " + wrong);

	}

	public static void quickSort(int arr[], int begin, int end) {

		System.out.println("BEFORE SORTING: " + Arrays.toString(arr));

		System.out.println("BEGIN: " + begin);
		System.out.println("END: " + end);

		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);
			System.out.println("PARTITION: " + partitionIndex);

			System.out.printf("PERFORM QUICKSORT ON INPUT FROM index %d, to %d\n\n", begin, partitionIndex - 1);
			quickSort(arr, begin, partitionIndex - 1);

			System.out.printf("PERFORM QUICKSORT ON INPUT FROM index %d, to %d\n\n", partitionIndex + 1, end);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		System.out.println(" \t\tPIVOT: " + pivot);
		System.out.println(" \t\t I= " + i);

		for (int j = begin; j < end; j++) {
			System.out.printf("COMPARING %d <= PIVOT>>%d<< \n", pivot, arr[j]);
			if (arr[j] <= pivot) {
				i++;
				System.out.printf("SWAPPING %d, %d \n", arr[i], arr[j]);
				swap(arr, i, j);
			}
		}

		swap(arr, (i + 1), end);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
