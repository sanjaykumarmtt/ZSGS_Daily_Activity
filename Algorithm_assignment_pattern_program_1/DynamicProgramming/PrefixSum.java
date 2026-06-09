package Algorithm_assignment_pattern_program_1.DynamicProgramming;

import java.util.Arrays;

public class PrefixSum {

	static int count=0;
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(Arrays.toString(prefixSum(arr)));  //10
		System.out.println(count);
	}
	public static int[] prefixSum(int arr[]) {
	int[] result=new int[arr.length];
	int[] mom=new int[arr.length];
	Arrays.fill(mom, -1);
	
	for(int i=0;i<arr.length;i++) {
		result[i]=PSum(arr,i,mom);
	}
	return result;
	}
	public static int PSum(int []arr,int i,int[] mom) {
		if(i==0) return arr[i];
		
		if(mom[i]!=-1) return mom[i];
		count++;
	
		return 	mom[i]=arr[i]+PSum(arr,i-1,mom);
	}
}
