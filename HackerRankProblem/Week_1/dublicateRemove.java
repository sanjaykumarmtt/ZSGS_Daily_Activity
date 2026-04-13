package HackerRankProblem.Week_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dublicateRemove {

	public static void main(String[] args) {
		
		String case1 = "Goodbye bye bye"
				+ " world world world";
		regex(case1);
	}

	private static void regex(String case1) {
	
		Pattern p=Pattern.compile("(\\w+)\\s+\\1");
		Matcher m=p.matcher(case1);
		
		while(m.find()) {
//			System.out.println(m.group()+" "+m.start()+" "+m.end());
			System.out.println(m.group()+" "+m.group(1));
		}
	}

}
