package leetcode_Daily_problems.Week_4_leetcode_problem;

public class PeakIndexMountainArray852 {

	public static void main(String[] args) {
		
		int arr[] = {0,1,0},
				arr1[] = {0,2,1,0},
				arr2[] = {0,5,10,2};
		System.out.println(peakIndexInMountainArray(arr));
		System.out.println(peakIndexInMountainArray(arr1));
		System.out.println(peakIndexInMountainArray(arr2));
	}
//70
	public static int peakIndexInMountainArray(int[] arr) {
		
		int left=0,
				right=arr.length-1;
		
		while(left<right) {
			
			if(arr[left]<arr[left+1]) {
				left=left+1;
			}else {
				right=left;
			}
		}
		return left;
	}

}
