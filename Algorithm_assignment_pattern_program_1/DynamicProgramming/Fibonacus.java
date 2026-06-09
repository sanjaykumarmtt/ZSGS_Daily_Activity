package Algorithm_assignment_pattern_program_1.DynamicProgramming;

public class Fibonacus {
	
	public static void main(String[] args) {	
		int n=5;
		int[] arr=new int[n+1];
		arr[1]=1;
		System.out.println(fibonacus(n,arr));
	}
	//top-down approach (memorization)
	public static int fibonacus(int n,int[] arr) {
		if(n==1 || n==0) return n;
		if(arr[n]!=0) {
			return arr[n]; 
		}
		return arr[n]=fibonacus(n-1,arr)+fibonacus(n-2,arr);
	}
}