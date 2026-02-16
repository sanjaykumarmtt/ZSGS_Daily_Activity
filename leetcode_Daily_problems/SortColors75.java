package leetcode_Daily_problems;

public class SortColors75 {
	public static void main(String[] args) {
		
		int nums[] = {2,0,2,1,1,0},
			nums1[] = {2,0,1};
		sortColor(nums);
		sortColor(nums1);
		for(int a:nums) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:nums1) {
			System.out.print(a+" ");
		}
	}
	private static void sortColor(int[] nums) {
		int left=0,
				mide=0,
				end=nums.length-1;
		while(mide<=end) {
			
			if(nums[mide]==0) {
				int temp=nums[left];
				nums[left]=nums[mide];
				nums[mide]=temp;
				left++;
				mide++;
			}else if(nums[mide]==1) {
				mide++;
			}else {
				int temp=nums[end];
				nums[end]=nums[mide];
				nums[mide]=temp;
				end--;
			}
		}
	
		
	}
}
