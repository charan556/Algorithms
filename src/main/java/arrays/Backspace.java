package arrays;

public class Backspace {

	public static void main(String[] args) {
		System.out.println(backspaceCompare("C#H#", "A#B#"));
	}

	/* beats 5% of solutions */
	public static boolean backspaceCompare2(String s, String t) {
		return removeCharacter(s).equals(removeCharacter(t));
	}

	public static String removeCharacter(String c) {
		StringBuilder builder = new StringBuilder();
		int delete = 0;
		for (int i = c.length() - 1; i >= 0; i--) {
			char k = c.charAt(i);
			System.out.println("GOT " + k + " DELETE:" + delete);
			if (k != '#') {
				if (delete == 0) {
					builder.insert(0, k);
				} else {
					delete--;
				}
			} else {
				delete++;
			}
		}
		return builder.toString();
	}

	/* beats 100% of solutions - */
	public static boolean backspaceCompare(String S, String T) {
		int i = S.length() - 1, j = T.length() - 1;
		int skipS = 0, skipT = 0;

		while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
			while (i >= 0) { // Find position of next possible char in build(S)
				if (S.charAt(i) == '#') {
					skipS++;
					i--;
				} else if (skipS > 0) {
					skipS--;
					i--;
				} else
					break;
			}
			while (j >= 0) { // Find position of next possible char in build(T)
				if (T.charAt(j) == '#') {
					skipT++;
					j--;
				} else if (skipT > 0) {
					skipT--;
					j--;
				} else
					break;
			}
			// If two actual characters are different
			if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
				return false;
			// If expecting to compare char vs nothing
			if ((i >= 0) != (j >= 0))
				return false;
			i--;
			j--;
		}
		return true;
	}
}
