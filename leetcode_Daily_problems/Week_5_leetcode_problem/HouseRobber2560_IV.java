package leetcode_Daily_problems.Week_5_leetcode_problem;

public class HouseRobber2560_IV {

	public static void main(String[] args) {
		
		int nums[] = {2,3,5,9},
			k = 2,
			nums1[] = {2,7,9,3,1}, 
			k1 = 2;
		System.out.println(minCapability(nums,k));
		System.out.println(minCapability(nums1,k1));
	}
	public static int minCapability(int[] nums, int k) {
		
		int low=Integer.MAX_VALUE,
			high=Integer.MIN_VALUE,
			result=0;
		for(int n:nums) {
			low=Math.min(low, n);
			high=Math.max(high, n);
		}
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(canRob(nums,k,mid)) {
				result=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return result;
	}
	static boolean canRob(int listOfHouse[],int k,int terget ) {
		
		int count=0;
		
		for(int i=0;i<listOfHouse.length;) {
			if(listOfHouse[i]<=terget) {
				i+=2;
				count++;
			}else {
				i++;
			}
			
			if(count>=k) return true;
		}
		return false;
	}

}
