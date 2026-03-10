package Algorithm_assignment_pattern_program_1.Sliding_Window;

public class MinimumSizeSubarraySum209 {
	public static void main(String[] args) {
		
		int target = 7, nums[] = {2,3,1,2,4,3},
				target1 = 4, nums1[] = {1,4,4};
		System.out.println(minSubArrayLen(target,nums));
		System.out.println(minSubArrayLen(target1,nums1));

	}
	public static int minSubArrayLen(int target, int[] nums) {
		
		int left=0,
				right,
				minsubarray=0,
				corrintPointer=Integer.MAX_VALUE;
		
		for(right=0;right<nums.length;right++) {
			minsubarray+=nums[right];
			while(minsubarray>=target) {
				corrintPointer= Math.min(corrintPointer, right-left+1);
				minsubarray-=nums[left];
				left++;
			}
		}		
		return corrintPointer;
	}

}
