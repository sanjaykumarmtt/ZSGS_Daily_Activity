package Algorithm_assignment_pattern_program_1;

import java.util.Arrays;

public class SquaresOfaSortedArray977 {
	public static void main(String[] args) {
		int  nums1[] = { -4, -1, 0, 3, 10 },
			 nums[] = { -7, -3, 2, 3, 11 };

		//System.out.println(Arrays.toString(squareOfArray(nums)));
		System.out.println(Arrays.toString(squareOfArray(nums1)));
		
		System.out.println(10*10);
	}
// [0, 1, 9, 16, 100]  16,100  16,9  1,9  1,0  0,0
	public static int[] squareOfArray(int array[]) {
		int[] squareOfNewArray = new int[array.length];

		int left = 0, right = array.length - 1, pointer = array.length - 1;

		while (left <=right) {
			int leftSquare = array[left] * array[left];
			int rightSquare = array[right] * array[right];
			
			System.out.println(leftSquare+" "+rightSquare);

			if (leftSquare > rightSquare) {
				squareOfNewArray[pointer] = leftSquare;
				left++;
			} else {
				squareOfNewArray[pointer] = rightSquare;
				right--;
			}
			pointer--;
		}
		return squareOfNewArray;
		
	}
}
