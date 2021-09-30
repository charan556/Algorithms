package arrays;

public class Reverse_Prefix_of_Word {

	public static void main(String[] args) {

		String input = "abcdefd";
		char ch = 'd';
		System.out.println(reversePrefix(input, ch));

	}

	public static String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch);
		if (index > 0) {
			StringBuilder res = new StringBuilder("");
			res.append(reverse(word.substring(0, index + 1))).append(word.substring(index + 1));
			return res.toString();
		}
		return word;
	}

	private static String reverse(String s) {

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length / 2; i++)
			swap(arr, i, arr.length - 1 - i);
		return String.valueOf(arr);
	}

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
