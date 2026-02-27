package leetcode_Daily_problems.Week2_and_week3_leetcode_problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement_II_229 {
	public static void main(String[] args) {
		int nums[] = { 3, 2, 3 }, nums1[] = { 1, 2 }, nums2[] = { 1 };
		System.out.println(majorityElement(nums));
		System.out.println(majorityElement(nums1));
		System.out.println(majorityElement(nums2));
	}

	public static List<Integer> majorityElement(int[] nums) {

//		if (nums.length <= 0)
//			return ;
		int lenthDvide = nums.length / 3;
		Map<Integer,Integer> map=new HashMap<>();
		
		List<Integer> lest=new ArrayList<>();

		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
			
			if(lenthDvide<map.get(nums[i])) {
				lest.add(nums[i]);
			}
		}
		return lest;
	}
}