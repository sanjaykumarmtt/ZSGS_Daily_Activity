package leetcode_Daily_problems.Week_6_leetcode_problem;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEquals_K560 {

	public static void main(String[] args) {

		int nums[] = {1,1,1},
				k = 2,
				nums1[] = {1,2,1,3},
				k1 = 3;
		
		System.out.println(subarraySum(nums,k));
		System.out.println(subarraySum(nums1,k1));
	}
	public static int subarraySum(int[] nums, int k) {
		
		int totalNumberOfSubarrayInK=0,
				sum=0;
		Map<Integer,Integer> map=new HashMap<>();
		
		map.put(0, 1);
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(map.containsKey(sum-k)) {
				totalNumberOfSubarrayInK+=map.get(sum-k);
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return totalNumberOfSubarrayInK; 
	}

}
