package arrays;

import java.util.Arrays;

public class Move_zeros_to_end {
	public static void main(String[] args) {

		int[] input = { 0, 1, 2, 0, 3, 4, 0 };

		moveZeros(input);
	}

	public static void moveZeros(int[] input) {

//		int dupZeros = 0;
//		for (int i = 0; i < input.length; i++) {
//			if (input[i] == 0) {
//				dupZeros++;
//			}
//		}

		int writePointer = 0;
		for (int readPointer = 0; readPointer < input.length; readPointer++) {

			if (input[readPointer] != 0) {
				System.out.printf("Replacing %d with %d \n", input[writePointer], input[readPointer]);
				input[writePointer] = input[readPointer];
				writePointer++;
			}

		}

		while (writePointer < input.length) {
			input[writePointer] = 0;
			System.out.printf("Replacing %d with %d \n", input[writePointer], 0);
			writePointer++;
		}

		System.out.println(Arrays.toString(input));
	}
}
