package arrays;

//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.
//
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//For example, inverting [0,1,1] results in [1,0,0].

public class Flipping_Image {

	public static void main(String[] args) {
		int[][] input = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		for (int[] arr : input) {
			arr = compliment(reverse(arr));
		}

	}

	private static int[] reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 - arr[i];
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int[] compliment(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 - arr[i];
		}
		return arr;
	}
}
