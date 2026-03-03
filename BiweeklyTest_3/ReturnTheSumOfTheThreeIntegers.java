package BiweeklyTest_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnTheSumOfTheThreeIntegers {

	public static void main(String[] args) {
		int nums1[] = { -1, 2, 1, -4 },
			target1 = 1;
		System.out.println("Output = "+SumOfTheThreeIntegers(nums1,target1));
	}

	public static int SumOfTheThreeIntegers(int nums[],int terget) {
		
		List<Integer> closestToTerget=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			if(i+2<nums.length) {
				closestToTerget.add(nums[i]+nums[i+1]+nums[i+2]);
			}
		}
		
		System.out.println(closestToTerget);
		
		int[] temp=new int[closestToTerget.size()];
		
		int closestSum=Integer.MAX_VALUE;
		
		for(int j=0;j<closestToTerget.size();j++) {
			temp[j]=Math.abs(closestToTerget.get(j) - terget);
			
			System.out.println(temp[j]+",");
		}
		
		for(int j:temp) {
			closestSum=Math.min(closestSum,j);
		}
		return closestSum+terget;
	}
}







