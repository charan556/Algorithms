package strings;

public class ReverseStringII {
	public static void main(String[] args) {
		System.out.println(reverse("abcdefg", 2)); // Expected: bacdfeg //Actual: cbadefg
	}

	public static String reverse(String s, int k) {
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

}
