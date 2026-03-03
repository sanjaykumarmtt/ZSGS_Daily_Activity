package Algorithm_assignment_pattern_program_1.Sliding_Window;

import java.util.Arrays;

public class MoveZeroes283 {
	public static void main(String[] args) {
		
		int nums[] = {0,1,0,3,12},
			nums1[] = {0};
		moveZeroes(nums);
		moveZeroes(nums1);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums1));
	}
	public static void moveZeroes(int[] nums) {
		
		int left=0,
			right=1;
		
		while(left<nums.length && right<nums.length) {
			
			if(nums[right]==0 && nums[left]==0) {
				right++;
				continue;
			}else if(nums[left]==0 && nums[right]!=0) {
				   int temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;
			}
			left++;
			right++;
		}	
	}
}
