package arrays;

import java.util.ArrayList;

/*
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class Reverse_words_in_string {
	public static void main(String[] args) {
		System.out.println(reverseStr("Let's take LeetCode contest"));
	}

	public static String reverseStr(String s) {

		ArrayList<String> words = new ArrayList<>();
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				words.add(reverseString(word.toString()).concat(" "));
				word = new StringBuilder();
			} else
				word.append(s.charAt(i));
		}

		StringBuilder res = new StringBuilder();
		for (String wordToBeReversed : words.toArray(new String[words.size()]))
			res.append(wordToBeReversed + " ");
		return res.toString().trim();

	}

	public static String reverseString(String ss) {
		char[] s = ss.toCharArray();
		int j = s.length - 1;
		for (int i = 0; i < (s.length / 2); i++) {
			char x = s[i];
			s[i] = s[j];
			s[j] = x;
			j--;
		}
		return String.valueOf(s);
	}

	public static String reverse(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < s.length(); i++)
			res.insert(0, s.charAt(i));
		return res.toString();
	}
}
