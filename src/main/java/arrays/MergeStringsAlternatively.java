package arrays;

public class MergeStringsAlternatively {
	public static void main(String[] args) {
		System.out.println(mergeAlternately("Hello", "World"));
	}

	public static String mergeAlternately(String word1, String word2) {
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();

		int length = (w1.length > w2.length) ? w1.length : w2.length;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			if (i < w1.length)
				sb.append(w1[i]);
			if (i < w2.length)
				sb.append(w2[i]);
		}
		return sb.toString();
	}
}
