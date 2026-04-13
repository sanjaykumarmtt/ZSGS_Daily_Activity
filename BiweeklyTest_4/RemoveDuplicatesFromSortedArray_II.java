package BiweeklyTest_4;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray_II {

	public static void main(String[] args) {

//		 nums = [1,1,1,2,2,3]
//				Output: 5, nums = [1,1,2,2,3,_]
//				Example 2
//				Input: nums = [0,0,1,1,1,1,2,3,3]
//				Output: 7,nums = [0,0,1,1,2,3,3,_,_]
//						
//						
		ArrayList<Integer> temp1 = new ArrayList<>();
		temp1.add(1);
		temp1.add(1);
		temp1.add(1);
		temp1.add(2);
		temp1.add(2);
		temp1.add(3);
		ArrayList<Integer> temp2 = new ArrayList<>();
		temp2.add(1);
		temp2.add(1);
		temp2.add(1);
		temp2.add(2);
		temp2.add(2);
		temp2.add(3);

		System.out.print(solve(temp1));
		System.out.print(solve(temp2));

	}

	static int solve(ArrayList<Integer> nums) {
		int k = 0, right, left = 0;
		boolean con = false;
		for (right = 0; right < nums.size(); right++) {
			int lengt = (right - left) + 1;

			if (!con && lengt == 3 && nums.get(right - 1) == nums.get(right)) {
				k = right;
				left = right;
				con = true;
			}

			if (left != right && con && nums.get(right - 1) != nums.get(right)) {
				nums.set(k, nums.get(right));
				con = false;
				lengt = 0;
			}
			if (lengt == 3 && nums.get(right - 1) != nums.get(right)) {
				left = right;
			}
			// [0, 0, 1, 1, 2, 1, 2, 3, 3]
		}

		System.out.print(nums + "   " + k + 1);
		return k + 1;
	}
}
