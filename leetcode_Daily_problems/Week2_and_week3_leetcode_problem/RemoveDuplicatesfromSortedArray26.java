package leetcode_Daily_problems.Week2_and_week3_leetcode_problem;

public class RemoveDuplicatesfromSortedArray26 {
	public static void main(String[] args) {
		int nums[] = { 1, 1, 2 }, nums1[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int n = removDuplicate(nums1);
		int n1 = removDuplicate(nums);
		for (int i = 0; i < n; i++) {
			System.out.print(nums1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n1; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	public static int removDuplicate(int array[]) {
		
		int count=0;
		for(int i:array) {
			if(count==0 || i!=array[count-1]) {
				array[count]=i;
				count++;
			}
		}
		return count;
	}

}
