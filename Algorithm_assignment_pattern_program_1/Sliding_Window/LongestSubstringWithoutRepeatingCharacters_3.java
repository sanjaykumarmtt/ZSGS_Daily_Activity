package Algorithm_assignment_pattern_program_1.Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {
	public static void main(String[] args) {		
		String s = "abcabcbb",
				s1 = "bbbbb";
		
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstring(s1));
	}
	public static int lengthOfLongestSubstring(String s) {
		
		Set<Character> set=new HashSet<>();
		
		int left=0,
			right,
			numberOfSubString=0;
		
		for(right=0;right<s.length();right++) {
			
			if(set.contains(s.charAt(right))) {
				set.remove(right);
			}
			
			
		}
		
		
		return 0;	
	}
}
