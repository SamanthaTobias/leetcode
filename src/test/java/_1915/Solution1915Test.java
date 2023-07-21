package _1915;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Solution1915Test {

	@Test
	void wonderfulSubstrings() {
		Solution1915 solution = new Solution1915();

		assertThat(solution.wonderfulSubstrings("aba")).isEqualTo(4);
		assertThat(solution.wonderfulSubstrings("aabb")).isEqualTo(9);
		assertThat(solution.wonderfulSubstrings("he")).isEqualTo(2);
	}
}