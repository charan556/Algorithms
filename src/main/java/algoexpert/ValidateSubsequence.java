package algoexpert;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
	public static void main(String[] args) {

		Integer[] input = { 5, 1, 22, 25, 6, -1, 8, 10 };
		Integer[] seq = { 1, 6, -1, -1 };

		System.out.println(isValidSubsequence(Arrays.asList(input), Arrays.asList(seq)));

	}

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

		int idx = 0;
		for (Integer val : array) {

			if (idx == sequence.size())
				break;

			if (val.equals(sequence.get(idx)))
				idx++;

		}

		return sequence.size() == idx;
	}
}
