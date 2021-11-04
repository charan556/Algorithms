package arrays;

import java.util.Arrays;

/*
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 */
public class CanPlaceFlowers {
	public static void main(String[] args) {
//		int[] input = { 1, 0, 0, 0, 1 };
//		int noOfFlowers = 1;

//		int[] input = { 1, 0, 0, 0, 0, 1 };
//		int noOfFlowers = 2;

//		int[] input = { 0, 0, 1, 0, 1 };
		int[] input = { 0, 0, 0, 0, 1 };
		int noOfFlowers = 1;

		System.out.println(canPlaceFlowers(input, noOfFlowers));
	}

	public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
		// what if n is 0?
		if (n == 0)
			return true;
		// what if the length of array is 1 and the value is 0
		if (flowerbed.length == 1 && flowerbed[0] == 0)
			return true;
		// what if the first two elements are 0? we can plant on first 0
		if (flowerbed[0] == 0 && flowerbed[1] == 0 && n > 0) {
			n--;
			flowerbed[0] = 1;
		}
		// what if the last and second last element is 0 we can plant on last spot
		if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0 && n > 0) {
			n--;
			flowerbed[flowerbed.length - 1] = 1;

		}

		for (int i = 1; i < flowerbed.length - 1 && n > 0; i++) {
			// condition when we need to ignore
			if (flowerbed[i - 1] == 1 || flowerbed[i + 1] == 1 || flowerbed[i] == 1)
				continue;

			flowerbed[i] = 1;
			n--;
			if (n == 0)
				return true;
		}

		return n == 0;
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		System.out.println("INPUT: " + Arrays.toString(flowerbed));
		int placed = 0;
		int length = flowerbed.length;
		if (length == 1 && flowerbed[0] == 0) {
			System.out.println("ONLY 1 POSITION AND IT IS ZERO");
			placed = 1;
		} else {
			System.out.println("MORE THAN 1 POSITION, SO CHECK HOW MANY ARE ALREADY PLANTED");
			if (flowerbed[0] == 0 && flowerbed[1] == 0) {
				System.out.println("STARTING POSITOIN CAN BE PLANTED");
				placed++;
				flowerbed[0] = 1;
			}
			if (length > 2 && flowerbed[length - 2] == 0 && flowerbed[length - 1] == 0) {
				placed++;
				flowerbed[length - 1] = 1;
			}
		}

		for (int i = 0; i < length - 2; i++) {
			if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
				flowerbed[i + 1] = 1;
				placed++;
			}
		}

		return placed >= n;
	}
}
