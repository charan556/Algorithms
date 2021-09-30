package arrays;

import java.util.Arrays;

public class Greatest_Element_on_Right_Side {
	public static void main(String[] args) {

		int[] input = { 17, 18, 5, 4, 6, 1 };

		if (input.length < 1) {
			input[0] = -1;
		}

		int max = input[input.length - 1];
		input[input.length - 1] = -1;

		for (int i = input.length - 2; i >= 0; i--) {
			int nextMax = Math.max(max, input[i]);
			input[i] = max;
			max = nextMax;
		}

		System.out.println(Arrays.toString(input));
	}
}
