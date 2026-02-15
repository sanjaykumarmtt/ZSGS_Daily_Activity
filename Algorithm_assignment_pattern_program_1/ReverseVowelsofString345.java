package Algorithm_assignment_pattern_program_1;

public class ReverseVowelsofString345 {
	public static void main(String[] args) {
		String s = "IceCreAm", s1 = "leetcode";

		System.out.println(reverseVowels(s));
		System.out.println(reverseVowels(s1));
	}

	public static String reverseVowels(String s) {
		int left = 0, right = s.length() - 1;
		char[] newArray = s.toCharArray();
		String vowels = "aeiouAEIOU";
		while (left < right) {
			while (left < right && vowels.indexOf(newArray[left]) == -1)
				left++;
			while (left < right && vowels.indexOf(newArray[right]) == -1)
				right--;

			char temp = newArray[left];
			newArray[left] = newArray[right];
			newArray[right] = temp;
			left++;
			right--;
		}
		return new String(newArray);
	}
}