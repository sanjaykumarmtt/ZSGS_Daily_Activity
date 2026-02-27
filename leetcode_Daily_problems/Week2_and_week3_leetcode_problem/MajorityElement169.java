package leetcode_Daily_problems.Week2_and_week3_leetcode_problem;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	public static void main(String[] args) {
		
		int nums[] = {3,2,3},nums1[] = {2,2,1,1,1,2,2};
		
		System.out.println(majorityElemenet(nums));
		System.out.println(majorityElemenet(nums1));
	}
	public static int majorityElemenet(int[] nums) {
		
		if(nums.length<=0) return 0;
		
		int lenthDvide=nums.length/2;
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
			  map.put(nums[i], map.get(nums[i])+1);	
			}else {
				map.put(nums[i], 1);
			}
			
			if(lenthDvide<map.get(nums[i])) {
				return nums[i];
			}
			
		}
		
		return 0;
	}
	

}
