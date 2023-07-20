package _1957;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

@SuppressWarnings("SpellCheckingInspection")
class Solution1957Test {

	@Test
	void test() {
		Solution1957 solution = new Solution1957();

		assertThat(solution.makeFancyString("leeetcode")).isEqualTo("leetcode");
		assertThat(solution.makeFancyString("aaabaaaa")).isEqualTo("aabaa");
		assertThat(solution.makeFancyString("aab")).isEqualTo("aab");
	}

}