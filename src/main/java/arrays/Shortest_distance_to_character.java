package arrays;

import java.util.Arrays;

public class Shortest_distance_to_character {
	public static void main(String[] args) {

		System.out.println(shortestToChar("loveleetcode", 'e'));

	}

	public static int[] shortestToChar(String S, char C) {
		int N = S.length();
		int[] ans = new int[N];
		int prev = Integer.MIN_VALUE / 2;

		for (int i = 0; i < N; ++i) {
			System.out.printf("{%c} comparing with {%c}", S.charAt(i), C);
			if (S.charAt(i) == C) {
				prev = i;
				System.out.println("overriding last seen to " + i);
			}
			ans[i] = i - prev;
			System.out.println(Arrays.toString(ans));
		}

		prev = Integer.MAX_VALUE / 2;
		for (int i = N - 1; i >= 0; --i) {
			System.out.printf("{%c} comparing with {%c}", S.charAt(i), C);
			if (S.charAt(i) == C) {
				prev = i;
				System.out.println("overriding last seen to " + i);
			}
			ans[i] = Math.min(ans[i], prev - i);
			System.out.println(Arrays.toString(ans));
		}

		return ans;
	}
}
