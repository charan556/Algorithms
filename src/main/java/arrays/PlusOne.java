package arrays;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int[] input = { 9};
		System.out.println(Arrays.toString(plusOne(input)));
	}

	public static int[] plusOne(int[] digits) {
		boolean one = true;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9 && one == true) {
				digits[i] = 0;
			} else {
				digits[i]++;
				one = false;
				break;
			}
		}
		if (one == true) {
			int[] ans = new int[digits.length + 1];
			Arrays.fill(ans, 0);
			ans[0] = 1;
			return ans;
		}
		return digits;
	}
}
