package arrays;

import java.util.Arrays;

public class Concatenation {
	public static int[] getConcatenation(int[] nums) {
		int size = nums.length;
		int[] ans = new int[size * 2];
		for (int i = 0; i < size; i++) {
			ans[i] = nums[i];
			ans[i + size] = nums[i];
			System.out.println(Arrays.toString(ans));
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 1 };
		System.out.println(Arrays.toString(getConcatenation(input)));
	}
}
