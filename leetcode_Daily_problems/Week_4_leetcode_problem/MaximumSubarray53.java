package leetcode_Daily_problems.Week_4_leetcode_problem;

public class MaximumSubarray53 {

	public static void main(String[] args) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4},
				nums1[] = {1},
				nums2[] = {5,4,-1,7,8};
		System.out.println(maxSubArray(nums));
		System.out.println(maxSubArray(nums1));
		System.out.println(maxSubArray(nums2));

	}

	public static int maxSubArray(int[] nums) {
		
		int currentMax=0,
				maxSubArray=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			currentMax=Math.max(nums[i],currentMax+ nums[i]);
			maxSubArray=Math.max(currentMax, maxSubArray);
		}
		
		return maxSubArray;

	}
}