package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {
	public static void main(String[] args) {
		int[] input = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(Arrays.toString(findDisappearedNumbers(input).toArray()));

	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int[] visited = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			visited[nums[i]]++;
			System.out.println("VALUE: " + nums[i] + "  VISITED: " + Arrays.toString(visited));
		}
		for (int i = 1; i < visited.length; i++) {
			if (visited[i] == 0)
				res.add(i);
		}
		return res;
	}

	public static List<Integer> findMissing(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}
}
