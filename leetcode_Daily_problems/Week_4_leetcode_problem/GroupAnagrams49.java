package leetcode_Daily_problems.Week_4_leetcode_problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {
	public static void main(String[] args) {
		
		String  strs[] = {"eat","tea","tan","ate","nat","bat"};		
		System.out.println(groupAnagrams(strs));

	}
	 public static List<List<String>> groupAnagrams(String[] strs) {
		 
	        Map<String,List<String>> map=new HashMap<>();
	        
	      for(String find:strs) {
	    	  String frquencyString=getfrquencyString(find);
	    	  if(map.containsKey(frquencyString)) {
	    		 
	    		  map.get(frquencyString).add(find);
	    	  }else {
	    		  List<String> temp=new ArrayList<>();
	    		  temp.add(find);
	    		  map.put(frquencyString, temp);
	    	  }
	      }
	      
	      System.out.println(map.values());
			return new ArrayList<>(map.values());	
	}
	 public static String getfrquencyString(String strs) {
		 
		 int[] getasc=new int[26];
		 
		 for(char ar:strs.toCharArray()) {
			 getasc[ar-'a']++;
		 }
		 
		 StringBuffer str=new StringBuffer();
		 char c='a';
		 for(int i:getasc) {
			 str.append(c);
			 str.append(i);
			 c++; 
		 }
//		 System.out.println(str);
		 
		 
		return new String(str);
	 }
}
