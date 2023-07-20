package _1984;

import java.util.Arrays;

public class Solution1984 {

	public int minimumDifference(int[] nums, int k) {
		if (k == 1) {
			return 0;
		}

		Arrays.sort(nums);

		Integer lowest = null;
		for (int i = 0; i < nums.length - (k-1); i++) {
			int start = nums[i];
			int end = nums[i+(k-1)];
			int difference = end - start;
			if (lowest == null || difference < lowest) {
				lowest = difference;
			}
		}

		return lowest;
	}

}
