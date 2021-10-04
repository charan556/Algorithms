package arrays;

import java.util.Arrays;

public class Intersection_II_350 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1, 3, 3 };
		int[] nums2 = { 2, 2, 1, 1, 2, 3 };
		System.out.println(Arrays.toString(intersect2(nums1, nums2)));
	}

	/*
	 * very basic this one beats 5% of submissions
	 */
	public static int[] intersect(int[] m, int[] n) {
		int[] ref = new int[10];// int[10001];
		int[] ans = new int[m.length < n.length ? m.length : n.length];
		int k = 0;
		for (int i = 0; i < m.length; i++) {
			System.out.println("Updating ref count for " + m[i]);
			ref[m[i]]++;
		}
		for (int i = 0; i < n.length; i++) {
			if (ref[n[i]] > 0) {
				ans[k++] = n[i];
				ref[n[i]]--;
			}
		}
		int[] ans1 = new int[k];
		for (int i = 0; i < k; i++)
			ans1[i] = ans[i];
		return ans1;
	}

	public static int[] intersect2(int[] nums1, int[] nums2) {
		int l1 = nums1.length, l2 = nums2.length;
		int hash[] = new int[10];
		for (int i = 0; i < l1; i++)
			hash[nums1[i]]++;
		// ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("INITIAL HASH ARR: " + Arrays.toString(hash));
		int index = 0;
		for (int i = 0; i < l2; i++) {
			if (hash[nums2[i]] > 0) {
				nums2[index++] = nums2[i];
				hash[nums2[i]]--;
			}
			System.out.println("nums2[" + i + "]: " + nums2[i] + " and hash arr " + Arrays.toString(hash));
			System.out.println("RESULT: " + Arrays.toString(nums2));
		}
		return Arrays.copyOfRange(nums2, 0, index);
	}
}
