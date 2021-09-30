package arrays;

import java.util.Arrays;

public class Sort_By_Parity {
	public static void main(String[] args) {
		int[] input = { 3, 6, 1, 2, 4 ,8};
		sort(input);
	}

	private static void sort(int[] input) {
		int writer = 0;
		for (int reader = 0; reader < input.length; reader++) {
			if (input[reader] % 2 == 0) {
				int temp = input[writer];
				input[writer] = input[reader];
				input[reader] = temp;
				writer++;
			}
		}
		System.out.println(Arrays.toString(input));
	}

}
