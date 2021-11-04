package arrays;

import java.util.Arrays;

public class RunningSum {
	public static int[] runningSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			nums[i] = sum;
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(runningSum(input)));
	}
}
