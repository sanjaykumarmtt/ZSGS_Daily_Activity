package leetcode_Daily_problems.Week_6_leetcode_problem;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 },
				nums1[] = { -1, 1, 0, -3, 3 };
		
		System.out.println(Arrays.toString(productExceptSelf(nums)));
		System.out.println(Arrays.toString(productExceptSelf(nums1)));
	}

	public static int[] productExceptSelf(int[] nums) {

		int[] prefix = new int[nums.length];
		prefix[0] = 1;

		int pref = nums[0];
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = prefix[i - 1] * pref;
			pref = nums[i];
		}
		int[] suffix = new int[nums.length];
		int suffixtemp = nums[nums.length - 1];
		suffix[nums.length - 1] = 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			suffix[i] = suffix[i +1] * suffixtemp;
			suffixtemp = nums[i];
		}
		int[] answer = new int[nums.length];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = suffix[i] * prefix[i];
		}
		return answer;
	}
}
