package _1957;

class Solution1957 {

	public String makeFancyString(String s) {
		StringBuilder sb = new StringBuilder();
		int skipped = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(i + ": " + c);
			if (sb.length() < 2 || sb.charAt(i-2-skipped) != c || sb.charAt(i-1-skipped) != c) {
				System.out.println("adding " + c);
				sb.append(c);
			} else {
				System.out.println("skipped " + c);
				skipped++;
			}
		}

		return sb.toString();
	}

}
