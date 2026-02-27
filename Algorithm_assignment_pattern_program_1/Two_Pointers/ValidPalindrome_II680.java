package Algorithm_assignment_pattern_program_1.Two_Pointers;

public class ValidPalindrome_II680 {

	public static void main(String[] args) {
		String s = "aba", s1 = "abca",s2 = "abc";
		System.out.println(isValidPalindrome(s));
		System.out.println(isValidPalindrome(s1));
		System.out.println(isValidPalindrome(s2));
	}

	public static boolean isValidPalindrome(String s) {

		int left = 0, right = s.length() - 1;

		while (left < right) {

			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return oneStepMove(s, left + 1, right) || oneStepMove(s, left, right - 1);
			}
		}
		return true;
	}

	public static boolean oneStepMove(String s, int left, int right) {

		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}
}
