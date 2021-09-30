package arrays;

import java.util.Arrays;
import java.util.Formatter;

public class ThirdDistinctMax {

	public static void main(String[] args) {

//		int[] input = { 2, 2, 4, 3, 5, 1, 2 };
//		int[] input = { 5, 2, 2 };
		int[] input = { 5, 2, 4, 1, 3, 6, 0 };
		System.out.println(thirdMax(input));
	}

	public static int thirdMax(int[] input) {
		Integer max = null;
		Integer max2 = null;
		Integer max3 = null;

		Formatter fmt = new Formatter();
		System.out.printf("%15s %15s %15s %15s\n", "Number", "MAX", "MAX2", "MAX3");

		for (Integer num : input) {

			if (num.equals(max) || num.equals(max2) || num.equals(max3)) {
				continue;
			}

			if (max == null || num > max) {
				max3 = max2;
				max2 = max;
				max = num;
			} else if (max2 == null || num > max2) {
				max3 = max2;
				max2 = num;
			} else if (max3 == null || num > max3) {
				max3 = num;
			}
			System.out.printf("%15s %15s %15s %15s\n", num, max, max2, max3);
		}

		if (max3 == null) {
			return max;
		}
		return max3;
	}

}
