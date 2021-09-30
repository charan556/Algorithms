package arrays;

import java.util.Arrays;

public class RemoveDuplicateInPlace {
	public static void main(String[] args) {
		int[] input2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int[] input = { 2, 3, 4, 2 };
		System.out.println(removeElement(input2, 2));
	}

	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				System.out.printf("Replacing %d with %d \n", nums[count], nums[i]);
				nums[count] = nums[i];
				count++;
			}
		}
		System.out.println("Final arry: " + Arrays.toString(nums));
		return count;
	}
}
