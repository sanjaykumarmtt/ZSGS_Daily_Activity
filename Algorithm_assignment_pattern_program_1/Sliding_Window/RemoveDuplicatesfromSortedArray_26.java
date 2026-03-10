package Algorithm_assignment_pattern_program_1.Sliding_Window;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray_26 {

	public static void main(String[] args) {
		int nums[] = {1,1,2},
			nums1[] = {0,0,1,1,1,2,2,3,3,4};
		
		for(int i=0;i<removeDuplicates(nums);i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println();
		
		for(int i=0;i<removeDuplicates(nums1);i++) {
			System.out.print(nums1[i]+",");
		}
	}
	public static int removeDuplicates(int[] nums) {
		
		int pointer=0;
		for(int n:nums) {
			if(pointer==0|| nums[pointer-1]!=n) {
				nums[pointer]=n;
				pointer++;
			}
		}
		return pointer;
	}
}
