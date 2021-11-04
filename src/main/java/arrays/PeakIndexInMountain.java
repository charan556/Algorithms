package arrays;

public class PeakIndexInMountain {
	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0, end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] < arr[mid + 1]) // increasing part
			{
				start = mid + 1; // as the element is greater than start for sure
			}
			
			if (arr[mid] > arr[mid + 1]) // decreasing part
			{
				end = mid; // as the element itself at that position should be included
			}
		}

		return start;
	}

	public static void main(String[] args) {
		int[] input = { 3, 4, 5, 1 };
		System.out.println(peakIndexInMountainArray(input));
	}
}
