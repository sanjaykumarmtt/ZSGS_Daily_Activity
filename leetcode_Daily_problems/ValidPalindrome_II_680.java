package leetcode_Daily_problems;
public class ValidPalindrome_II_680 {
	public static void main(String[] args) {
		String s = "aba",s1 = "abca";
		System.out.println(validPalindrome(s));
		System.out.println(validPalindrome(s1));
	}
	public static boolean validPalindrome(String s) {
		
		s=s.toLowerCase();
		int left=0,right=s.length()-1;
		
		while(left<right) {
			
			if(s.charAt(left)==s.charAt(right)) {
				left++;
				right--;
			}else {
				return ignorOneCharacter(right,left+1,s) || ignorOneCharacter(right-1,left,s);
			}
		}
		return true;
	}
	public static boolean ignorOneCharacter(int right,int left,String s) {
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
		}
		return true;
	}
}
