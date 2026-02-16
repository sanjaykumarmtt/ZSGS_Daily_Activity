package leetcode_Daily_problems;

public class FindPeakElement162 {

	public static void main(String[] args) {
		
		int nums[] = {1,2,1,3,5,6,4},
			nums1[] = {1,2,3,1};
		
		System.out.println(findePickElement(nums));	
		System.out.println(findePickElement(nums1));	
	}
	public static int findePickElement(int []nums) {
		
		int left=0,
			right=nums.length;
		while(left<right) {
			int mide=(right+left)/2;
			
			if(nums[mide]<nums[mide+1]) {
				left=mide+1;
			}else {
				right=mide;
			}
			
		}
	
		return right;	
	}
}
