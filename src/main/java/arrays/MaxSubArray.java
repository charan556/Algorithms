package arrays;

public class MaxSubArray {
	public static void main(String[] args) {
//		int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int[] input = { -2, 2, 5, -11, 6 };
		System.out.println(maxSubArray(input));
	}

	public static int maxSubArray(int[] nums) {

		int sum = nums[0];
		int maxSum = nums[0];

		System.out.printf("VAL\tSUM\tMAX\n");
		for (int i = 1; i < nums.length; i++) {
			sum = Math.max(nums[i], nums[i] + sum);
			if (sum > maxSum) {
				maxSum = sum;
			}
			System.out.printf("%d\t%d\t%d\n", nums[i], sum, maxSum);
		}
		return maxSum;
	}

}
