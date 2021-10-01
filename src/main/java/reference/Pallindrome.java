package reference;

public class Pallindrome {
	public static boolean isPalindrome(int number) {
		int original = number;
		int reverse = 0;
		int x;
		while (number != 0) {
			x = number % 10;
			reverse = reverse * 10 + x;
			number /= 10;
		}
		return (original == reverse) ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1221));
	}
}
