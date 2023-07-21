package _1915;

import java.util.HashMap;
import java.util.Map;

public class Solution1915 {

	public long wonderfulSubstrings(String word) {
		long count = 0;

		for (int start = 0; start < word.length(); start++) {
			for (int end = start+1; end <= word.length(); end++) {
				String substring = word.substring(start, end);
				if (isWonderful(substring)) {
					count++;
				}
			}
		}

		return count;
	}

	private boolean isWonderful(String substring) {
		Map<Character, Integer> letterCount = new HashMap<>();

		for (int i = 0; i < substring.length(); i++) {
			char c = substring.charAt(i);
			letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
		}

		int odd = 0;
		for (Character c : letterCount.keySet()) {
			if (letterCount.get(c) % 2 != 0) {
				odd++;
			}
			if (odd > 1) {
				return false;
			}
		}

		return true;
	}

}
