package leetcode_Daily_problems.Week_4_leetcode_problem;

public class BinarySearch_704 {

	public static void main(String[] args) {
		
		int nums[] = {-1,0,3,5,9,12}, target = 9,
			nums1[] = {-1,0,3,5,9,12}, target1 = 2;
		
		System.out.println(search(nums,target));
		System.out.println(search(nums1,target1));

	}
	public static int search(int[] nums, int target) {
		
		int left=0,right=nums.length-1;
		
		while(left<right) {
			
			int mid=(right+left)/2;
			
			if(nums[mid]==target) {
				return mid;
			}else if(mid<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
			
		}
		
		
		return -1;
	}
}
