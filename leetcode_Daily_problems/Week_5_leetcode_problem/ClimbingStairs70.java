package leetcode_Daily_problems.Week_5_leetcode_problem;
public class ClimbingStairs70 {
	public static void main(String[] args) {
		
		System.out.println(climbStairs(2));
		
	}
	public static int climbStairs(int n) {
		
		int[] ways=new int[n+1];
		ways[0]=1;
		ways[1]=1;
		
		for(int i=2;i<=n;i++) {
			ways[i]=ways[i-1]+ways[i-2];
		}
	  return ways[n];
	}
}
