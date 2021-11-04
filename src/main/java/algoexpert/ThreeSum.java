package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		int[] input = { 12, 3, 1, 2, -6, 5, -8, 6 };
		int targetSum = 0;

		List<Integer[]> result = threeNumberSum(input, targetSum);
		result.stream().forEach(x -> {
			System.out.println(Arrays.toString(x));
		});
	}

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

		int right = array.length - 1;

		Arrays.sort(array);
		System.out.println("INPUT ARRAY: " + Arrays.toString(array));

		int pointer = 0;

		List<Integer[]> result = new ArrayList<>();

		while (pointer <= right) {
			int refSum = targetSum - array[pointer];
			for (int left = pointer + 1; left < right;) {
				System.out.printf("COMPARING %d and %d WITH REF SUM %d", array[left], array[right], refSum);
				if (array[left] + array[right] == refSum) {
					Integer[] resultSubArray = { array[pointer], array[left], array[right] };
					result.add(resultSubArray);
					System.out.printf("\t ADD TO RESULT");
					right--;
					left++;
				} else if (array[left] + array[right] > refSum) {
					right--;
				} else if (array[left] + array[right] < refSum) {
					left++;
				}
				System.out.println();
			}
			pointer++;
			right = array.length - 1;
		}
		return result;
	}
}
