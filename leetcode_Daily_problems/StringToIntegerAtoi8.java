package leetcode_Daily_problems;

public class StringToIntegerAtoi8 {
	public static void main(String[] args) {
	
		String s="1337c0d3",
			   s1="42",
			   s2="   -042",
			   s3="0-1",
			   s4="words and 987";
		
		System.out.println(findDigit(s));
		System.out.println(findDigit(s1));
		System.out.println(findDigit(s2));
		System.out.println(findDigit(s3));
		System.out.println(findDigit(s4));

	}
	public static int findDigit(String s) {
		
		
		
		s=s.trim();
		//System.out.println(s);
		if(s.isEmpty()) return 0;
		int sig=1,index=0;
		
		long outPut=0;
		if(s.charAt(index)=='-' || s.charAt(index)=='+') {
			sig=(s.charAt(index)=='-')?-1:1;
			index++;
		}
		
		while(index<s.length() && Character.isDigit(s.charAt(index))){
			int digit=s.charAt(index)-'0';
			outPut=outPut*10+digit;
			if(outPut*sig>Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if(outPut*sig<Integer.MIN_VALUE) return Integer.MIN_VALUE;
			index++;
		}
		
		return (int) outPut*sig;
	}
}
