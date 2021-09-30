package arrays;

public class MountainArray {
	public static void main(String[] args) {
		int[] input = { 1, 3, 5, 6, 4, 5, 2, 3, 1 };
		System.out.println(isMountain(input));
	}

	public static boolean isMountain(int[] input) {

		if (input.length < 3) {
			return false;
		}

		int i = 1;
		boolean up = false;
		boolean down = false;
		while (i < input.length && input[i] > input[i - 1]) {
			up = true;
			i++;
		}

		while (i < input.length && input[i] < input[i - 1]) {
			down = true;
			i++;
		}

		if (i == input.length && up == down == true) {
			return true;
		} else {
			return false;
		}

	}
}
