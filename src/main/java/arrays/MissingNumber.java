package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] input = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };// { 3, 0, 1 };
		System.out.println(missing(input));
	}

	public static int missing(int[] input) {

		int length = input.length;

		int missing = (length * (length + 1) / 2);
		for (int i : input) {
			missing = missing - i;
		}
		return missing;
	}
}
