package arrays;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
	public static void main(String[] args) {
		int[] input = { 1, 3, 2, 3, 1, 4, 1 };

		Arrays.sort(input);

		System.out.println(Arrays.toString(input));
		removeDuplicates(input);
	}

	public static void removeDuplicates2(int[] input) {
		System.out.println("BEFORE: " + Arrays.toString(input));

		// make sure array is sorted
		for (int i = 0, j = 0; j < input.length; j++) {
			System.out.println(input[j] + " not equals to " + input[i] + " ??");
			if (input[j] != input[i]) {
				i++;
				input[i] = input[j];
			}
		}
		System.out.println("AFTER: " + Arrays.toString(input));
	}

	public static int removeDuplicates(int[] nums) {
		int temp = 0;

		if (nums.length == 0) {
			return 0;
		}

		int iterCount = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println("ITRCNT: " + (++iterCount) + "---" + nums[temp] + "----" + nums[i]);
			if (nums[temp] != nums[i]) {
				nums[++temp] = nums[i];
			}
		}
		return temp + 1;
	}
}
