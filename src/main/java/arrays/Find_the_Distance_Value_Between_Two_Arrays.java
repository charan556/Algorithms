package arrays;

import java.util.Arrays;

public class Find_the_Distance_Value_Between_Two_Arrays {
	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 8 };
		int[] arr2 = { 10, 9, 1, 8 };
		int d = 2;
		System.out.print(findDistance(arr1, arr2, d));
	}

	private static int findDistance(int[] arr1, int[] arr2, int d) {
		Arrays.sort(arr2);
		System.out.println("ARRAY AFTER SORTED: " + Arrays.toString(arr2));
		int ans = 0;
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("SEARCHING FOR %d in ARRAY2 FROM INDEX %d, %d\n", arr1[i], 0, arr2.length);
			int it = binarySearch(arr2, 0, arr2.length, arr1[i]);
			if (it < 0)
				it = -(it + 1);
			boolean isIt = false;
			if (it < arr2.length && Math.abs(arr2[it] - arr1[i]) <= d)
				isIt = true;
			if (it != 0 && Math.abs(arr2[it - 1] - arr1[i]) <= d)
				isIt = true;
			if (!isIt)
				ans++;
		}
		return ans;
	}

	private static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		System.out.printf("LOW %d, HIGH %d, ", low, high);
		while (low <= high) {
			int mid = (low + high) >>> 1;
			System.out.printf("MID %d , MID VALUE %d", mid, a[mid]);
			if (a[mid] < key) {
				low = mid + 1;
				System.out.printf(", NEW LOW %d\n", low);
			} else if (a[mid] > key) {
				high = mid - 1;
				System.out.printf(", NEW HIGH %d\n", high);
			} else
				return mid; // key found
		}
		System.out.printf("RETURNING -(%d+1)\n", low);
		return -(low + 1); // key not found.
	}

}
