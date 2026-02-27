package leetcode_Daily_problems.Week_4_leetcode_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsString438 {

	public static void main(String[] args) {
		String  s = "cbaebabacd", p = "abc",  //10
				 s1 = "abab", p1 = "ab";
		System.out.println(findAnagrams(s,p));
		System.out.println(findAnagrams(s1,p1));
	}
	public static List<Integer> findAnagrams(String s, String p) {
		
		int[] findAscOfP=new int[26];
		for(int i=0;i<p.length();i++) {
			findAscOfP[p.charAt(i)-'a']++;
		}
		int left=0,right;
		
		List<Integer> getAngramStartIndex=new ArrayList<>();
		
		int[] chakAndGetAscOfS=new int[26];
		for(right=0;right<s.length();right++) {
			
			chakAndGetAscOfS[s.charAt(right)-'a']++;
			
			if((right-left+1)==p.length()) {
				//System.out.println(right-left+1);
				if(Arrays.equals(findAscOfP, chakAndGetAscOfS)) {
					getAngramStartIndex.add(left);
				}
				chakAndGetAscOfS[s.charAt(left)-'a']-=1;
				left++;
			}
		}
		return getAngramStartIndex;	
	}
}
