package BiweeklyTest;

import java.util.ArrayList;
import java.util.List;

public class RearrangeWordsSolver {

	public static void main(String[] argin) {
		String sentence1 = "Leetcode makes me happy",
			   sentence2 = "Keep calm and carry on",
			   sentence3 = "To be or not to be";

		System.out.println(rearrangeWords(sentence1));
		System.out.println(rearrangeWords(sentence2));
		System.out.println(rearrangeWords(sentence3));
	}

	public static String rearrangeWords(String sentence) {

		String[] words = sentence.split(" ");
		words[0] = words[0].toLowerCase();

		int maxLen = 0;
		for (String word : words) {
			maxLen = Math.max(maxLen, word.length());
		}

		List<String>[] buckets = new List[maxLen + 1];
		for (int i = 0; i <= maxLen; i++) {
			buckets[i] = new ArrayList<>();
		}

		for (String word : words) {
			buckets[word.length()].add(word);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= maxLen; i++) {
			for (String word : buckets[i]) {
				if (sb.length() > 0) {
					sb.append(" ");
				}
				sb.append(word);
			}
		}

		String result = sb.toString();
		if (result.length() > 0) {
			result = Character.toUpperCase(result.charAt(0)) + result.substring(1);
		}

		return result;
	}

}
