package reference;

public class IntegerReverse {

	public static void main(String[] args) {
//		printPowersOf2(33);
		int x = 2147483647+1;
		System.out.println(x);
	}

	public static void printPowersOf2(int x) {
		for (int i = 0; i < x + 1; i++) {
			int y = exponent(i);
			System.out.print(y);
			if (!(i == x)) {
				System.out.print("\n");
			}
		}
		System.out.println();
	}

	static int exponent(int power) {
		int output = 1;
		for (int z = 0; z < power; z++)
			output *= 2;
		return output;
	}

	public static int reverse(int number) {

		int rev = 0;
		int x;
		while (number != 0) {
			x = number % 10;
			rev = rev * 10 + x;
			number = number / 10;
			System.out.println(" Number: " + number + "     X: " + x + "    Reverse: " + rev);
		}
		return rev;
	}
}
