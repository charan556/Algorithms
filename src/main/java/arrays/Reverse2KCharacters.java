package arrays;

public class Reverse2KCharacters {
	public static void main(String[] args) {
		System.out.println(reverseStr("CHARAN", 3));
 	}

	public static String reverseStr2(String s, int k) {
		char[] a = s.toCharArray();
		for (int start = 0; start < a.length; start += 2 * k) {
			int i = start;
			int j = Math.min(start + k - 1, a.length - 1);
			while (i < j) {
				char tmp = a[i];
				a[i++] = a[j];
				a[j--] = tmp;
			}
		}
		return new String(a);
	}

	public static String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
		int i = 0;
		int n = arr.length;

		while (i < n) {
			if (i + k < n) {
				reverse(arr, i, i + k - 1);
			} else {
				reverse(arr, i, n - 1);
			}

			i = i + 2 * k;
		}

		return new String(arr);
	}

	public static void reverse(char[] arr, int start, int end) {
		int low = start;
		int high = end;

		while (low < high) {
			if (arr[low] != arr[high]) {
				char temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}

			low++;
			high--;
		}
	}
}
