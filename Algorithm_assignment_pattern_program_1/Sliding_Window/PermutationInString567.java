package Algorithm_assignment_pattern_program_1.Sliding_Window;

import java.util.Arrays;

public class PermutationInString567 {
	public static void main(String[] args) {
		
		String s1 = "ab",
				s2 = "eidbaooo",
				s11 = "ab",
				s22 = "eidboaoo";
		
		System.out.println(checkInclusion(s1,s2));
		System.out.println(checkInclusion(s11,s22));

	}
	public static boolean checkInclusion(String s1, String s2) {
		
		int[] s1Frequency=new int[26];
		
		for(int i=0;i<s1.length();i++) {
			s1Frequency[s1.charAt(i)-'a']++;
		}
		//System.out.println(Arrays.toString(s1Frequency));
		int left=0,
				right;
		
		int[] s2Frequency=new int[26];
		for(right=0;right<s2.length();right++) {
			
			s2Frequency[s2.charAt(right)-'a']++;
			
			if((right-left+1)==s1.length()) {
				
				if(Arrays.equals(s1Frequency, s2Frequency)) {
					return true;
				}
				s2Frequency[s2.charAt(left)-'a']-=1;
				left++;
			}
			
		}
		//System.out.println(Arrays.toString(s2Frequency));
		return false;	
	}
}
