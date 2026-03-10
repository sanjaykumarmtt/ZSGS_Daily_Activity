package Algorithm_assignment_pattern_program_1.Sliding_Window;

public class MaxConsecutiveOnes485 {
	public static void main(String[] args) {
		
		int nums[] = {1,1,0,1,1,1},
			nums1[] = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
		System.out.println(findMaxConsecutiveOnes(nums1));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		
		int left=0,
				right,
				maxcoutivesubArray=Integer.MIN_VALUE;
		
//		int i='c'-'0';
		for(right=0;right<nums.length;right++) {
//			if(nums[right]==0) {
//				while(nums[left]!=0) {
//					left++;
//				}
//				left++;
//				continue;
//			}
			if(nums[right]==1) {
				maxcoutivesubArray=Math.max(maxcoutivesubArray, right-left+1);
			}else {
				left=right+1;
			}
		}
		return maxcoutivesubArray;	
	}
}
