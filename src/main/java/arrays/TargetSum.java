package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TargetSum {

	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			Integer diff = (Integer) (target - numbers[i]);
			if (hash.containsKey(diff)) {
//				int toReturn[] = { hash.get(diff) + 1, i + 1 };
				int toReturn[] = { hash.get(diff), i };
				return toReturn;
			}
			hash.put(numbers[i], i);
		}
		return null;
	}

	/*
	 * more runtime
	 */
	public static int[] twoSum2(int[] nums, int target) {
		int[] ans = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int index = 0; index < nums.length; index++) {
			if (!map.containsKey(nums[index])) {
				map.put(target - nums[index], index);
			} else {
				ans[0] = index;
				ans[1] = map.get(nums[index]);
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] x = twoSum(nums, 10);
		System.out.println(Arrays.toString(x));
	}
}
