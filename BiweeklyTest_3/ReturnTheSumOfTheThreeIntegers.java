package BiweeklyTest_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnTheSumOfTheThreeIntegers {

	public static void main(String[] args) {
		int nums1[] = { -1, 2, 1, -4 },
			target1 = 1, nums2[] = {0,0,0}, target2 = 1;
		System.out.println("Output = "+SumOfTheThreeIntegers(nums1,target1));
		System.out.println("Output = "+SumOfTheThreeIntegers(nums2,target2));
	}

	public static int SumOfTheThreeIntegers(int nums[],int terget) {
		
		List<Integer> closestToTerget=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			if(i+2<nums.length) {
				closestToTerget.add(nums[i]+nums[i+1]+nums[i+2]);
			}
		}
		System.out.println(closestToTerget);
		
		
		
		int closestSum=Integer.MAX_VALUE,minum=0;
		
		for(int j=0;j<closestToTerget.size();j++) {
			int temp1=Math.abs(closestToTerget.get(j) - terget);
			
			if(closestSum>temp1) {
				closestSum=temp1;
				minum=closestToTerget.get(j);
			}
			
			System.out.println(temp1+",");
		}
		
		return minum;
	}
}







