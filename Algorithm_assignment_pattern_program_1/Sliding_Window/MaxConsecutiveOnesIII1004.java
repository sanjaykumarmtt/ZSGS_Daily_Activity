package Algorithm_assignment_pattern_program_1.Sliding_Window;

public class MaxConsecutiveOnesIII1004 {

	public static void main(String[] args) {
	
		int nums[] = {1,1,1,0,0,0,1,1,1,1,0}, k = 2,
				nums1[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, k1 = 3;
		System.out.println(longestOnes(nums,k));//6
		System.out.println(longestOnes(nums1,k1));//10
	}
	public static int longestOnes(int[] nums, int k) {
		
		int left=0,
				right,
				zero=0,
				maximumNumberOfConsecutive=0;
		
		for(right=0;right<nums.length;right++) {
			
			if(nums[right]==0) {
				zero++;
			}
			
			while(zero>k) {
				
				if(nums[left]==0) {
					zero--;
				}
				left++;	
			}
			
			maximumNumberOfConsecutive=Math.max(maximumNumberOfConsecutive,(right-left)+1);
		}
		
		
		return maximumNumberOfConsecutive;
	}

}



