package arrays;

import java.util.HashSet;
import java.util.Set;

public class NandItsDoubleSearch {
	public static void main(String[] args) {

		int[] input = { 7, 1, 14, 11 };
		System.out.println(checkIfExist(input));
	}

	public static boolean checkIfExist(int[] arr) {

		Set<Integer> s = new HashSet<>();
		for (int i : arr) {
			if (s.contains(i * 2) || (i % 2 == 0 && s.contains(i / 2))) {
				return true;
			} else {
				s.add(i);
			}
		}
		return false;
	}
}
