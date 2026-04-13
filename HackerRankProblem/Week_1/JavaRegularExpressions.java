package HackerRankProblem.Week_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpressions {

	public static void main(String[] args) {

		String case1 = "Goodbyebyebyeworldworld    world12444@#$%^^%$";
		chakeFisteWored(case1);
		chakeEndWored(case1);
		chakeFindeWored(case1);
		chakeAnyTowCharacterInTheWored(case1);
		chakeGropingCharacterInTheWored(case1);
		chakeExcept_A_and_B_eWored(case1);
		chakeExcept_a_to_z_eWored(case1);
		chakeSpaceWored(case1);
	}
	
	static void chakeFindeWored(String name) {
		//1.
		Pattern p = Pattern.compile("Goodbye");
		Matcher m = p.matcher(name);
		System.out.println();
		while (m.find()) {
			System.out.println("chakeFisteWored: "+m.group() + " " + m.start() + " " + m.end());
		}
	}
	static void chakeFisteWored(String name) {
		//2.
		Pattern p = Pattern.compile("^Goodbye");
		Matcher m = p.matcher(name);
		System.out.println();
		while (m.find()) {
			System.out.println("chakeFisteWored: "+m.group() + " " + m.start() + " " + m.end());
		}
	}
	static void chakeEndWored(String name) {
		//3.
		Pattern p = Pattern.compile("world$");
		Matcher m = p.matcher(name);
		System.out.println();
		while (m.find()) {
			System.out.println("chakeEndWored: "+m.group() + " " + m.start() + " " + m.end());
		}
	}
	static void chakeAnyTowCharacterInTheWored(String name) {
		//4.
		Pattern p = Pattern.compile("b|G");
		Matcher m = p.matcher(name);
		System.out.println();
		while (m.find()) {
			System.out.println("chake Any Tow Character In The Wored: "+m.group() + " " + m.start() + " " + m.end());
		}
	}
	static void chakeGropingCharacterInTheWored(String name) {
		//5.
		Pattern p = Pattern.compile("[Glr]");
		Matcher m = p.matcher(name);
		System.out.println();
		while (m.find()) {
			System.out.println("chake Groping Character In The Wored: "+m.group() + " " + m.start() + " " + m.end());
		}
	}
	
	static void chakeExcept_A_and_B_eWored(String name) {
		//6.
		Pattern p = Pattern.compile("[^Gl]");
		Matcher m = p.matcher(name);
		System.out.println();
		while (m.find()) {
			System.out.println("chakeExcept A and B Wored In The Wored: "+m.group() + " " + m.start() + " " + m.end());
		}
	}
	static void chakeExcept_a_to_z_eWored(String name) {
		//7.
		Pattern p = Pattern.compile("[^a-zA-Z0-9\\s+]");
		Matcher m = p.matcher(name);
		System.out.println();
		while (m.find()) {
			System.out.println("chakeExcept_a_to_z_In The Wored: "+m.group() + " " + m.start() + " " + m.end());
		}
	}
	static void chakeSpaceWored(String name) {
		//8.
		Pattern p = Pattern.compile("\\d"); //   \\s  \\s+ \\S   \\d digits
		Matcher m = p.matcher(name);
		System.out.println();
		int i=1;
		while (m.find()) {
			System.out.println("chake Space Wored: "+m.group() + " " + m.start() + " " + m.end());
//			System.out.println(i++);
		}
	}
	
}
