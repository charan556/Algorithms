package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(29));
	}

	public static boolean isHappy(int n) {

		Set<Integer> set = new HashSet<>();
		while (true) {

			int result = 0;
			while (n > 0) {
				int lastDigit = n % 10;
				result += (lastDigit * lastDigit);
				n = n / 10;
			}

			System.out.println("RESULT:::: " + result);
			if (result == 1) {
				return true;
			} else {
				if (!set.contains(result)) {
					set.add(result);
					n = result;
					print(set);
				} else {
					System.out.println("Breaking...");
					break;
				}
			}
		}
		return false;
	}

	private static void print(Set<Integer> set) {
		System.out.print(" SET::: ");
		if (set != null && set.size() > 0) {
			List<Integer> lst = new ArrayList<>(set);
			lst.stream().forEach(x -> System.out.printf("%d, ", x));
		}
		System.out.println();
	}
}
