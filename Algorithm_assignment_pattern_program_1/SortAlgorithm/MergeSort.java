package Algorithm_assignment_pattern_program_1.SortAlgorithm;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 6 }, arr2[] = { 4, 5, 6, 7, 9 };
		System.out.println(Arrays.toString(sort(arr1, arr2)));
		int arr[] = { 1, 3, 4, 6, 4, 5, 7, 6, 9 };
		System.out.println(Arrays.toString(sort(arr1, arr2)));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		// System.out.println("hello");
	}

	public static int[] sort(int arr1[], int arr2[]) {
		int left = 0, right = 0, i = 0;
		int[] newArray = new int[arr1.length + arr2.length];
		int count = 0;
		while (left < arr1.length && right < arr2.length) {
			if (arr1[left] < arr2[right]) {
				newArray[i] = arr1[left];
				left++;
			} else {
				newArray[i] = arr2[right];
				right++;
			}
			i++;
			count++;
			while (left >= arr1.length && right < arr2.length) {
				newArray[i] = arr2[right];
				right++;
				i++;
				count++;
			}
			while (left < arr1.length && right >= arr2.length) {
				newArray[i] = arr1[left];
				left++;
				i++;
				count++;
			}
		}
		System.out.println(count);
		return newArray;
	}

	public static void sort(int arr[]) {
		int length = arr.length / 2, left = 0, right = length, k = 0;
		int[] newArray = new int[arr.length];
		// 1, 3, 4, 6, 4, 5, 6, 7, 9 };
		while (left < length && right < arr.length) {
			if (arr[left] < arr[right]) {
				newArray[k] = arr[left];
				left++;
			} else {
				newArray[k] = arr[right];
				right++;
			}
			k++;
			System.out.println("hello w3 " + " " + length + " " + left + " " + right);
		}
		while (left < length) {
			newArray[k] = arr[left];
			left++;
			k++;

		}
		while (right < arr.length) {
			newArray[k] = arr[right];
			right++;
			k++;

		}
		System.out.println("hello arrr");
//		arr = newArray.clone();
		for(int i=0;i<arr.length;i++) {
			arr[i]=newArray[i];
		}
//		return arr;
	}
	
}