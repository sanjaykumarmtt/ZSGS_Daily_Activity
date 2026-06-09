package Algorithm_assignment_pattern_program_1.Two_Pointers;

import java.util.Arrays;

public class MergeSorting {

	public static void main(String[] args) {

		int arr[] = { 38, 2, 1, 43, 17, 52 ,4,6,5};
		int[] tempArray = new int[arr.length];
		sort(arr, 0, arr.length,tempArray);
		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int arr[], int start, int end,int tempArray[]) {
		if (end - start == 1)
			return;

		int mid = start + (end - start) / 2;
		sort(arr, start, mid,tempArray);
		sort(arr, mid, end,tempArray);
		mergeSort(arr, start, mid, end,tempArray);
	}

	public static void mergeSort(int arr[], int start, int mid, int end,int tempArray[]) {

		
		int i = start, j = mid, k = start;

		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				tempArray[k] = arr[i];
				i++;
			} else {
				tempArray[k] = arr[j];
				j++;
			}
			k++;
			while (i < mid && j >= end) {
				tempArray[k] = arr[i];
				i++;
				k++;
			}
			while (j < end && i >= mid) {
				tempArray[k] = arr[j];
				j++;
				k++;
			}
		}
//		while(i < mid) {
//			tempArray[k]=arr[i];
//			i++;
//			k++;
//		}
//		while (j < end) {
//			tempArray[k] = arr[j];
//			j++;
//			k++;
//		}

		for (int t = start; t < end; t++) {
			arr[t] = tempArray[t];
		}
	}
}
