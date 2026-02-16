package Algorithm_assignment_pattern_program_1;

public class ValidPalindrome125 {

	public static void main(String[] args) {
		String  s = "A man, a plan, a canal: Panama" ,s1= "race a car",s2 = " ";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));

	}
	 public static boolean isPalindrome(String s) {
		 s=s.toLowerCase();
		 int left=0,right=s.length()-1;
		 
		 while(left<right) {
			 
			 if(!Character.isLetterOrDigit(s.charAt(left))) {
				 left++;
			 }else if(!Character.isLetterOrDigit(s.charAt(right))) {
				 right--;
			 }else if(s.charAt(left)!=s.charAt(right)) {
				 return false;
			 }else {
				 left++;
				 right--;
			 }
		 }
		return true;
	 }
}
