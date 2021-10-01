package reference;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static int romanToInt2(String s) {

		Map<Character, Integer> numbersMap = new HashMap<>();
		numbersMap.put('I', 1);
		numbersMap.put('V', 5);
		numbersMap.put('X', 10);
		numbersMap.put('L', 50);
		numbersMap.put('C', 100);
		numbersMap.put('D', 500);
		numbersMap.put('M', 1000);

		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (numbersMap.get(s.charAt(i)) < numbersMap.get(s.charAt(i + 1)))
				sum -= numbersMap.get(s.charAt(i));
			else
				sum += numbersMap.get(s.charAt(i));
		}
		return sum += numbersMap.get(s.charAt(s.length() - 1));
	}

	public static int romanToInt(String s) {
		int nums[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'M':
				nums[i] = 1000;
				break;
			case 'D':
				nums[i] = 500;
				break;
			case 'C':
				nums[i] = 100;
				break;
			case 'L':
				nums[i] = 50;
				break;
			case 'X':
				nums[i] = 10;
				break;
			case 'V':
				nums[i] = 5;
				break;
			case 'I':
				nums[i] = 1;
				break;
			}
		}

		int sum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1])
				sum -= nums[i];
			else
				sum += nums[i];
		}

		return sum + nums[nums.length - 1];
	}

	public static void main(String[] args) {
		System.out.println(romanToInt2("IDM"));
	}
}
