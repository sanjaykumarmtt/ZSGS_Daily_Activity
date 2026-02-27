package leetcode_Daily_problems.Week2_and_week3_leetcode_problem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {2,7,11,15}, target = 9;
		int nums1[] = {3,2,4}, target1 = 6;
		System.out.println(Arrays.toString(twoSum(nums,target)));
		System.out.println(Arrays.toString(twoSum(nums1,target1)));
	}
	private static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int sum=target-nums[i];
			
			if(map.containsKey(sum)) {
				return new int[]{map.get(sum),i};
			}
				map.put(nums[i], i);
		}
		return new int[]{0,0};
	}
}
