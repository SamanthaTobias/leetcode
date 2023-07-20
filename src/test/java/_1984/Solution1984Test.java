package _1984;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Solution1984Test {

	@Test
	void test() {
		Solution1984 solution = new Solution1984();

		assertThat(solution.minimumDifference(new int[]{90}, 1)).isEqualTo(0);
		assertThat(solution.minimumDifference(new int[]{9, 4, 1, 7}, 2)).isEqualTo(2);
	}

}