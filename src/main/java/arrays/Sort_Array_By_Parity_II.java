package arrays;

import java.util.Arrays;

/*Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]*/
public class Sort_Array_By_Parity_II {
	public static void main(String[] args) {

		int[] input = { 888, 505, 627, 846 };
		System.out.println(Arrays.toString(sortArrayByParityII(input)));
	}

	public static int[] sortArrayByParityII(int[] nums) {
		// Special case
		if (nums == null || nums.length == 0) {
			return nums;
		}
		// Length of the array
		int n = nums.length;
		// Left and right pointers
		int left = 0;
		int right = n - 1;
		// Loop until the condition is met
		while (left < n && right >= 0) {
			// If both the numbers at wrong positions, we will swap them
			if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left += 2;
				right -= 2;
			}
			// If the left number is at wrong position but right
			// number is at correct position, we will move right
			// pointer two steps before
			else if (nums[left] % 2 == 1 && nums[right] % 2 == 1) {
				right -= 2;
			}
			// If the right number is at wrong position but left
			// number is at correct position, we will move left
			// pointer two steps after
			else if (nums[left] % 2 == 0 && nums[right] % 2 == 0) {
				left += 2;
			}
			// If both the numbers are at correct position, we just move
			// both the pointers
			else {
				left += 2;
				right -= 2;
			}
		}
		return nums;
	}
}
