package leetcode_Daily_problems.Week_6_leetcode_problem;

import java.util.Stack;

public class DecodeString394 {
	public static void main(String[] args) {
		
	String s = "3[a]2[bc]",
			s1 = "3[a2[c]]",
			s2 = "2[abc]3[cd]ef";
	
	System.out.println(decodeString(s));
	System.out.println(decodeString(s1));
	System.out.println(decodeString(s2));
	}
	 public static String decodeString(String s) {
		 
		 Stack<String> characterAndOpenSquareBrackets = new Stack<>();
	        Stack<Integer> kNumbers = new Stack<>();
	  
	        StringBuilder result=new StringBuilder("");
	        int temp = 0;
	        
	        for(int i=0;i<s.length();i++) {
	        	
	        	if(Character.isDigit(s.charAt(i))) {
	        		while(Character.isDigit(s.charAt(i))) {
	        			temp=temp*10+s.charAt(i)-'0';
	        			i++;
	        		}
	        		kNumbers.push(temp);
	        		temp=0;
	        		i--;
	        	}else if(s.charAt(i)!=']') {
	        		characterAndOpenSquareBrackets.push(Character.toString(s.charAt(i)));
	        	}else {
	        		 decodeString(kNumbers, characterAndOpenSquareBrackets);
	        	}
	        }
	        for (int j = 0; j < characterAndOpenSquareBrackets.size(); j++) {
	            result.append(characterAndOpenSquareBrackets.get(j));
	            //System.out.println(characterAndOpenSquareBrackets.get(j));
	        }
	        characterAndOpenSquareBrackets.clear();
	        kNumbers.clear();
	        return new String(result);
	 }
	private static void decodeString(Stack<Integer> kNumbers, Stack<String> characterAndOpenSquareBrackets) {
		
		int k=kNumbers.pop();
		
		StringBuilder temp=new StringBuilder("");
		StringBuilder setWorde=new StringBuilder("");
		
		while(!characterAndOpenSquareBrackets.isEmpty() && !characterAndOpenSquareBrackets.peek().equals("[")) {
			temp.insert(0,characterAndOpenSquareBrackets.pop());
		}
		
		if(!characterAndOpenSquareBrackets.isEmpty() && characterAndOpenSquareBrackets.peek().equals("[")) {
			characterAndOpenSquareBrackets.pop();
		}
		for(int i=0;i<k;i++) {
			setWorde.append(temp);
		}
		characterAndOpenSquareBrackets.push(new String(setWorde));
		//System.out.println(setWorde +" "+k);
		
	}
}
