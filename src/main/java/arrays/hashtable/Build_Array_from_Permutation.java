package arrays.hashtable;

//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
//Explanation: The array ans is built as follows: 
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//    = [0,1,2,4,5,3]
public class Build_Array_from_Permutation {
	public static void main(String[] args) {
		int[] input = { 0, 2, 1, 5, 3, 4 };
		buildArray(input);
	}

	public static int[] buildArray(int[] nums) {
		int[] result = new int[nums.length];

		int index = 0;
		for (int i : nums) {
			result[index++] = nums[i];
		}

		return buildArray(nums);
	}
}
