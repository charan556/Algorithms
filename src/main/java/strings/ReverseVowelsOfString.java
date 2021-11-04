package strings;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
	public static void main(String[] args) {
		System.out.println(reverseVowels("LeetCode"));
	}

	public static String reverseVowels(String s) {
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('A');
		vowels.add('e');
		vowels.add('E');
		vowels.add('i');
		vowels.add('I');
		vowels.add('o');
		vowels.add('O');
		vowels.add('u');
		vowels.add('U');

		int i = 0;
		int j = s.length() - 1;
		char[] cArr = s.toCharArray();

		while (i < j) {
			if (vowels.contains(cArr[i]) && vowels.contains(cArr[j])) {
				char temp = cArr[i];
				cArr[i] = cArr[j];
				cArr[j] = temp;
				i++;
				j--;
			} else if (!vowels.contains(cArr[i]) && vowels.contains(cArr[j])) {
				i++;
			} else if (vowels.contains(cArr[i]) && !vowels.contains(cArr[j])) {
				j--;
			} else if (!vowels.contains(cArr[i]) && !vowels.contains(cArr[j])) {
				i++;
				j--;
			}

		}
		return new String(cArr);
	}

}
