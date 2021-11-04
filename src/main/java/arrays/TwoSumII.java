package arrays;

import java.util.Arrays;

public class TwoSumII {
	public static void main(String[] args) {
		int[] input = { 2, 7, 11, 15 };
		int target = 9;

		int[] input2 = { 2, 3, 4 };
		int target2 = 6;

		int[] input3 = { -1, 0 };
		int target3 = -1;

		System.out.println(Arrays.toString(twoSum(input, target)));
		System.out.println(Arrays.toString(twoSum(input2, target2)));
		System.out.println(Arrays.toString(twoSum(input3, target3)));
	}

	public static int[] twoSum(int[] numbers, int target) {

		int[] result = new int[2];

		int first = 0;
		int last = numbers.length - 1;

		while (first < last) {
			if (numbers[first] + numbers[last] == target) {
				result[0] = first + 1;
				result[1] = last + 1;
				break;
			} else if ((numbers[first] + numbers[last]) < target) {
				first++;
			} else {
				last--;
			}
		}

		return result;

	}
}
