package leetcode_Daily_problems.Week_5_leetcode_problem;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {

	public static void main(String[] args) {
		System.out.println(generate(5));
		
//		[1],
//	   [1,1],
//	  [1,2,1],
//   [1,3,3,1],
//	[1,4,6,4,1]
	}
	public static List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> pasCal=new ArrayList<>();
		
		for(int i=0;i<numRows;i++) {
			List<Integer> pas=new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) {
					pas.add(1);
				}else {
					List<Integer> temp=pasCal.get(i-1);
					pas.add(temp.get(j-1)+temp.get(j));
				}
			}
			pasCal.add(pas);
		}
		return pasCal;
	}

}
