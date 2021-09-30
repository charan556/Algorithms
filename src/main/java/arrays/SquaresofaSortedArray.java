package arrays;

import java.util.Arrays;

public class SquaresofaSortedArray {
	public static void main(String[] args) {
		int[] input = { -7, -6, 2, 3, 5 };
		System.out.println(Arrays.toString(sortedSquares(input)));
	}

	public static int[] sortedSquares(int[] nums) {
		int n = nums.length;

		int[] result = new int[n];
		int slow = 0;
		int fast = n - 1;

		for (int p = n - 1; p >= 0; p--) {
			if (Math.abs(nums[slow]) > Math.abs(nums[fast])) {
				result[p] = nums[slow] * nums[slow];
				slow++;
			} else {
				result[p] = nums[fast] * nums[fast];
				fast--;
			}
		}
		return result;
	}
}
