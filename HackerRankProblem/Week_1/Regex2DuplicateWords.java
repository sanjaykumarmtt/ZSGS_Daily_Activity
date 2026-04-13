package HackerRankProblem.Week_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2DuplicateWords {
	public static void main(String[] args) {

		String case1 = "Goodbye bye bye world world world", case2 = "Sam went went to to to his business",
				case3 = "Reya is is the the best player in eye eye game", case4 = "in inthe",
				case5 = "Hello hello Ab aB";
//		System.out.println(DuplicateWords(case1));
//		System.out.println(DuplicateWords(case2));
//		System.out.println(DuplicateWords(case3));
//		System.out.println(DuplicateWords(case4));
//		System.out.println(DuplicateWords(case5));
		regex(case1);
	}

	public static String DuplicateWords(String kase) {

		String[] testKes = kase.trim().split(" ");

		StringBuilder add = new StringBuilder();

		int putPoint = 0;

		for (int i = 0; i < testKes.length; i++) {
			if (i == 0 || !testKes[putPoint - 1].equalsIgnoreCase(testKes[i])) {
				testKes[putPoint] = testKes[i];
				add.append(testKes[putPoint]);
				add.append(" ");
				putPoint++;
			}
		}
		return add.toString();
	}

	public static void regex(String input) {
		String regex = "\\b(\\w+)(\\s+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);

		while (m.find()) {
			input = input.replaceAll(m.group(), m.group(1));
		}

		System.out.println(input);
	}

	public static void main() {

		// 1. மீண்டும் மீண்டும் வரும் வார்த்தையைக் கண்டுபிடிக்க (RegEx)
		// \b -> வார்த்தையின் தொடக்கம் (Boundary)
		// (\w+) -> முதல் வார்த்தையை ஒரு குழுவாக (Group 1) பிடி
		// \s+ -> இடையில் இருக்கும் ஸ்பேஸ்
		// \1 -> முதல் குழுவில் பிடித்த அதே வார்த்தை மீண்டும் வருகிறதா எனப் பார்
		// (Backreference)
		// \b -> அந்த வார்த்தையின் முடிவு
		// ( ... )+ -> இதே போல எத்தனை முறை வந்தாலும் பிடி
		String regex = "\\b(\\w+)(\\s+\\1\\b)+";

		// 2. Case-Insensitive ஆக மாற்ற Pattern.CASE_INSENSITIVE பயன்படுத்தவும்
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// 3. பிடிபட்ட மொத்த கூட்டத்தையும் (m.group())
			// முதல் முறை வந்த வார்த்தையால் ($1) மாற்றவும்
			while (m.find()) {
				input = input.replaceAll(m.group(), m.group(1));
			}

			System.out.println(input);
		}
		in.close();
	}

}