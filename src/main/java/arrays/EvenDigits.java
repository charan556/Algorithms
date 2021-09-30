package arrays;

public class EvenDigits {
	public static void main(String[] args) {
		int[] input = { 1234, 12, 123, 411, 12311, 12312 };

		System.out.println(findEvenDigitsInArray(input));

	}

	public static int findEvenDigitsInArray(int[] input) {
		int evenCount = 0;
		for (int i : input) {
			int count = 0;
			while (i != 0) {
				i /= 10;
				count++;
			}
			if (count % 2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}
}
