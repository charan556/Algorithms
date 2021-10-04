package arrays;

public class Reverse_Only_Letters {

	public static void main(String[] args) {

		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}

	public static String reverseOnlyLetters(String S) {
		int i = 0, j = S.length() - 1;
		char[] ch = S.toCharArray();

		while (i < j) {
			if (!Character.isLetter(ch[i]))
				i++;
			else if (!Character.isLetter(ch[j]))
				j--;
			else {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		return new String(ch);
	}

}
