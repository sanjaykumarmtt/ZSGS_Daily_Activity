package leetcode_Daily_problems.Week_5_leetcode_problem;

public class HouseRobber_198 {
	public static void main(String[] args) {
		int nums[] = {1,2,3,1},
			nums1[] = {2,7,9,3,1};
		
		System.out.println(rob(nums));
		System.out.println(rob(nums1));
	}
	
	public static int rob(int[] nums) {
		
		int rob1=0,
			rob2=0;
		
		for(int i=0;i<nums.length;i++) {
			
			int currentRobHome=Math.max(nums[i]+rob1, rob2);
			
			rob1=rob2;
			rob2=currentRobHome;		
		}
		
		return rob2;
	}
	
}
