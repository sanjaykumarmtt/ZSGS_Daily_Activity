package Algorithm_assignment_pattern_program_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {

	public static void main(String[] args) {
		List<List<Integer>>  list=new ArrayList<>();
		int nums[]= {-1,0,1,2,-1,-4};
		threeSum(nums,list);
		System.out.println(list);
	}
	public static void threeSum(int nums[],List<List<Integer>> list) {
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-2;i++) {
			if(i>0 && nums[i]==nums[i-1])
				continue;
			int left=i+1,rigth=nums.length-1;
			
			while(left<rigth) {
				int sum=nums[i]+nums[left]+nums[rigth];
				
				if(sum==0) {
					List<Integer> list1=new ArrayList<>();
					list1.add(nums[i]);
					list1.add(nums[left]);
					list1.add(nums[rigth]);
					list.add(list1);
					//list.add(Arrays.asList(nums[i], nums[left], nums[rigth]));
					 while(left<rigth && nums[left]==nums[left+1]) left++;
					 while(left<rigth && nums[rigth]==nums[rigth-1]) rigth--;
					 left++;
					 rigth--;
					 
				}else if(sum<0) {
					left++;
				}else {
					rigth--;
				}
				
			}
		}
	}
	
	
	
//	 public static String rearrangeWords(String s) {
//
//	    	String[] s1=s.trim().toLowerCase().split("\\s");
//	    	
//	    	List<String> s2=new ArrayList<>();
//	   
//	    	for(int i=0;i<s1.length;i++) {
//	    		int minLength=Integer.MAX_VALUE;
//	    		for(String temp:s1) {
//	    			if(minLength>temp.length() && !s2.contains(temp)) {
//	    				minLength=temp.length();
//	    				s2.add(i,temp);
//	    			}
//	    		}
//	    	}
//	    	s="";
//	    	for(String a:s2) {
//	    	s+=a+" ";
//	    	}
//			return s;
//	    }
//}