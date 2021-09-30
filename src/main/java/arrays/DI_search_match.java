package arrays;

import java.util.Arrays;

//942. DI String Match
/*
 * 
 * Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]
Example 3:

Input: s = "DDI"
 Output: [3,2,0,1]
 *
 */

public class DI_search_match {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(match("DDI")));
	}

	public static int[] match(String input) {
		int[] matchArr = new int[input.length() + 1];
		char[] inputArr = input.toCharArray();

		int j = input.length();
		int k = 0;

		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == 'I') {
				matchArr[i] = k++;
			} else {
				matchArr[i] = j--;
			}
		}
		matchArr[input.length()] = k;

		return matchArr;

	}
}
