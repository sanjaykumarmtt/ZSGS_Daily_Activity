package Algorithm_assignment_pattern_program_1.Two_Pointers;

public class ContainerWithMostWater11 {
	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7},
				height1[] = {1,1};
		
		System.out.println(maxWater(height));
		System.out.println(maxWater(height1));
		System.out.println(-4*-4);
	}
	public static int maxWater(int height[]) {
		
		int left=0,
			rigth=height.length-1,
			maxOfQuantityWater=Integer.MIN_VALUE;
		while(left<rigth) {
			int width=rigth-left;
			int maxHeight=Math.min(height[left], height[rigth]);
			maxOfQuantityWater=Math.max(maxOfQuantityWater, width*maxHeight);
			System.out.println(maxHeight+"*"+width+"="+(width*maxHeight));
			
			if(height[left]<height[rigth]) {
				left++;
				
			}else {
				rigth--;
			}
		}
		return maxOfQuantityWater;
	}

}
