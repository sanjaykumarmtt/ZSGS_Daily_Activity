package leetcode_Daily_problems.Week_5_leetcode_problem;

public class HouseRobber213_II {

	public static void main(String[] args) {
		
		int nums[] = {2,3,2},
			nums1[] = {1,2,3,1};
		System.out.println(rob(nums));
		System.out.println(rob(nums1));
	}
	public static int rob(int[] nums) {
		
		int robHomeOne=startRobHome(0,nums,nums.length-1),
			robHomeTwo=startRobHome(1,nums,nums.length);;

		return Math.max(robHomeOne, robHomeTwo);
	}
	static int startRobHome(int startHome,int[] listHome, int endHome){
		int rob1=0,
			rob2=0;
		for(int i=startHome;i<endHome;i++) {
			int currentHome=Math.max(listHome[i]+rob1, rob2);
			rob1=rob2;
			rob2=currentHome;
		}
		return rob2;
	}
}
