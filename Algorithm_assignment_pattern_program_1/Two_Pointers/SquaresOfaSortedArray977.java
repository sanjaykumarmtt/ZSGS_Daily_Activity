package Algorithm_assignment_pattern_program_1.Two_Pointers;

import java.util.Arrays;

public class SquaresOfaSortedArray977 {
	public static void main(String[] args) {
		int nums[] = { -7, -3, 2, 3, 11 }, nums1[] = { -4, -1, 0, 3, 10 };

		System.out.println(Arrays.toString(squareOfArray(nums)));
		System.out.println(Arrays.toString(squareOfArray(nums1)));
		
	}

	public static int[] squareOfArray(int array[]) {
		int[] squareOfNewArray = new int[array.length];

		int left = 0, right = array.length - 1, pointer = array.length - 1;

		while (left <=right) {
			int leftSquare = array[left] * array[left];
			int rightSquare = array[right] * array[right];

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
