package arrays;

/*+
 * Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
 */

public class PerformOperations {
	public static int finalValueAfterOperations(String[] operations) {
		int idx = 0;
		int val = 0;
		while (idx < operations.length) {
			if (operations[idx].startsWith("--")) {
				--val;
			} else if (operations[idx].startsWith("++")) {
				++val;
			} else if (operations[idx].endsWith("--")) {
				val--;
			} else if (operations[idx].endsWith("++")) {
				val++;
			}
			idx++;
		}
		return val;
	}

	public static void main(String[] args) {
		String[] input = { "++X", "++X", "X++" };
		System.out.println(finalValueAfterOperations(input));
	}
}
