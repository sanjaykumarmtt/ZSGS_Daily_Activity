package Algorithm_assignment_pattern_program_1.Two_Pointers;

import java.util.Arrays;

public class TwoSum_I_I {
	public static void main(String[] args) {
		int numbers[]= {2,7,11,15}, target = 9;
		System.out.println(Arrays.toString(twoSum(numbers,target)));
	}
	public static int[] twoSum(int array[],int target) {
		int left=0,rigth=array.length-1;
		while(left<rigth) {
			int sum=array[left]+array[rigth];
			
			if(sum==target) {
				return new int [] {left+1,rigth+1};
			}else if(sum<target) {
				left++;
			}else {
				rigth--;
			}
		}
		return new int[] {};
	}
}