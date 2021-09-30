package arrays;

public class MaxConsecutive {
	public static void main(String[] args) {
		int[] input = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(input));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int maxCnt = 0;
		int cnt = 0;
		for (int i : nums) {
			if (i == 1) {
				cnt++;
			} else {
				if (maxCnt < cnt) {
					maxCnt = cnt;
				}
				cnt = 0;
			}
		}
		return Math.max(maxCnt, cnt);
	}

	public static int findMaxConsecutiveOnes_Sol2(int[] nums) {
        int maxOnes = 0;
        int maxOneCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxOneCnt++;
                if (maxOneCnt > maxOnes)
                    maxOnes = maxOneCnt;
            } else
                maxOneCnt = 0;
        }
        return maxOnes;
    }
}
