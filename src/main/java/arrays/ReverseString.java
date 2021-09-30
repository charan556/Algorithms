package arrays;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("Charan".toCharArray()));
	}

	public static char[] reverseString(char[] s) {
		int j = s.length - 1;
		for (int i = 0; i < (s.length / 2); i++) {
			char x = s[i];
			s[i] = s[j];
			s[j] = x;
			j--;
		}
		return s;
	}

}
