package leetcode_Daily_problems;

public class MoveZeroes83 {

	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12},nums1[] = {0};
		moveZeroEnde(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]+" ");
		}
	}
	public static void moveZeroEnde(int[] nums) {
		int left=0,
			rigth=1;
		while(left<rigth && rigth<nums.length) {			
			if(nums[left]==0 && nums[rigth]==0) {
				rigth++;
				continue;
			}else if((nums[left]==0 && nums[rigth]!=0)) {
				int temp=nums[left];
				nums[left]=nums[rigth];
				nums[rigth]=temp;
			}
			left++;
			rigth++;	
		}
	}
}