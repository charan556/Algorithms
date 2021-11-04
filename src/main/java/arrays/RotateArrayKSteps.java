package arrays;

import java.util.Arrays;

public class RotateArrayKSteps {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(rotate(input, 2)));
	}

	public static int[] rotate(int[] input, int k) {

		k = k % input.length;
		reverse(input, 0, input.length - 1);
		reverse(input, 0, k - 1);
		reverse(input, k, input.length - 1);
		return input;
	}

	private static void reverse(int[] input, int start, int end) {
		while (start < end) {
			int temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
		}
	}
}
