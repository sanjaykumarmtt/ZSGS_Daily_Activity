package leetcode_Daily_problems.Week_6_leetcode_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEvenandOddIndicesIndependently2164 {
	public static void main(String[] args) {
		
		int  nums[] = {4,1,2,3},
				nums1[] = {2,1};
		
		System.out.println(Arrays.toString(sortEvenOdd(nums)));
		System.out.println(Arrays.toString(sortEvenOdd(nums1)));	
	}
	public static int[] sortEvenOdd(int[] nums) {
		
		List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				even.add(nums[i]);
			}else {
				odd.add(nums[i]);
			}
		}
	Collections.sort(even);
	Collections.sort(odd,Collections.reverseOrder());
	
	int even1=0,
			odd1=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]%2==0) {
			nums[i]=even.get(even1++);
		}else {
			nums[i]=odd.get(odd1++);
		}
	}
		return nums;
	}

}
