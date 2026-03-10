package BiweeklyTest_3;

public class Sum3Test {

	public static void main(String[] args) {
		int nums1[] = { -1, 2, 1, -4 }, target1 = 1, nums[] = {0,0,0}, target = 1;
		System.out.println("Output = " + SumOfTheThreeIntegers(nums1, target1));
		System.out.println("Output = " + SumOfTheThreeIntegers(nums, target));
	}

	public static int SumOfTheThreeIntegers(int nums[], int terget) {

		int count = Integer.MAX_VALUE, colusevalu = 0;

		for (int i = 0; i < nums.length - 2; i++) {

			int sum = nums[i] + nums[i + 1] + nums[i + 2];
			int count1 = Math.abs(sum - terget);
			System.out.println(sum+" "+count1);
			if (count > count1) {
				count=count1;
				colusevalu=sum;
			}
		}

		return colusevalu;
	}
}
