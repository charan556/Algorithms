package arrays;

public class Binary_substrings {
	public static void main(String[] args) {
		String input = "00110011";
		// There are 6 substrings that have equal number of
		// consecutive 1's and 0's:
		// "0011"
		// , "01"
		// , "1100"
		// , "10"
		// , "0011"
		// , and "01".
		System.out.println(countBinarySubstrings(input));
	}

	public static int countBinarySubstrings(String s) {

		int prevBlock = 0;
		int currBlock = 1;
		int binarySubs = 0;

		char current = s.charAt(0);

		for (int i = 1; i < s.length(); i++) {
			// 1==1
			if (s.charAt(i) == current) {
				currBlock++;
			} else {
				binarySubs = binarySubs + Math.min(prevBlock, currBlock);
				prevBlock = currBlock;
				currBlock = 1;
			}
			current = s.charAt(i);
		}
		binarySubs += Math.min(prevBlock, currBlock);
		return binarySubs;
	}
}
