package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Intersection_of_arrays {
	public static void main(String[] args) {

//		int[] a1 = { 4, 9, 5 };
//		int[] a2 = { 9, 4, 9, 8, 4 };

		int[] a1 = { 999, 2, 2, 1 };
		int[] a2 = { 2, 2, 999 };

		System.out.println(Arrays.toString(intersection2(a1, a2)));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set = new HashSet<>();
		for (int i : nums1) {
			set.add(i);
		}

		HashSet<Integer> intersection = new HashSet<>();

		for (int i : nums2) {
			if (set.contains(i)) {
				intersection.add(i);
			}
		}
		int[] arr = new int[intersection.size()];
		int index = 0;

		for (int i : intersection) {
			arr[index++] = i;
		}
		return arr;

	}

	/*
	 * 1 <= nums1.length, nums2.length <= 1000
	 * 0 <= nums1[i], nums2[i] <= 1000
	 */
	public static int[] intersection2(int[] nums1, int[] nums2) {
		boolean[] flag = new boolean[1000]; // we declare it with 1000 because of 2 constaints above

		for (int num : nums2)
			flag[num] = true;

		List<Integer> matchList = new ArrayList<>();
		for (int num : nums1) {
			if (flag[num]) {
				matchList.add(num);
				flag[num] = false;
			}
		}

		int[] res = new int[matchList.size()];
		for (int i = 0; i < matchList.size(); i++)
			res[i] = matchList.get(i);

		return res;

	}
}
