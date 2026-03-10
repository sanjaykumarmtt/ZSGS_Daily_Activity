package leetcode_Daily_problems.Week_6_leetcode_problem;

public class CompareVersionNumbers165 {
	public static void main(String[] args) {
		
		String version1 = "1.2", version2 = "1.10",
				version3 = "1.01", version4 = "1.001",
						version5 = "1.0", version6 = "1.0.0.0";
		
		
		System.out.println(compareVersion(version1,version2));
		System.out.println(compareVersion(version3,version4));
		System.out.println(compareVersion(version5,version6));
	}
	public static int compareVersion(String version1, String version2) {
		
		int verSion1=0,
				verSion2=0;
		
		while(verSion1<version1.length() || verSion2<version2.length()) {
			
			int number1=0,
	                number2=0;
			
			while(verSion1<version1.length() && version1.charAt(verSion1)!='.') {
				number1=number1*10+version1.charAt(verSion1)-'0';
				verSion1++;
			}
			while(verSion2<version2.length() && version2.charAt(verSion2)!='.') {
				number2=number2*10+version2.charAt(verSion2)-'0';
				verSion2++;
			}
			
			if(number1!=number2) {
				return -1;
			}
			verSion1++;
			verSion2++;
		}
		
	   return 1;
	}
}