package strings;

/*
 * Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(validPalindrome("A man, a plan, a canal: Panama"));
	}

	private static boolean validPalindrome(String sentence) {
		
		int i = 0, j = sentence.length() - 1;
		while (i <= j) {
			if (!Character.isLetterOrDigit(sentence.charAt(i))) {
				i++;
			} else if (!Character.isLetterOrDigit(sentence.charAt(j))) {
				j--;
			} else {
				if (Character.toLowerCase(sentence.charAt(i)) != Character.toLowerCase(sentence.charAt(j))) {
					return false;
				}
				i++;
				j--;
			}
		}
		return true;
	}
}
