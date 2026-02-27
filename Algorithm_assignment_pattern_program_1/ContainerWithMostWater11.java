package Algorithm_assignment_pattern_program_1;

public class ContainerWithMostWater11 {
	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7},
				     // 0,1,2,3,4,5,6,7,8
				height1[] = {1,1};
		System.out.println(maxWater(height));
				
	}
	public static int maxWater(int height[]) {
		
		int left=0,
			rigth=height.length-1,
			maxOfQuantityWater=Integer.MIN_VALUE;
		
		while(left<rigth) {
			int width=rigth-left;
			//8 ,7 ,6 ,5 ,4 ,3 ,2 ,1
			
			int maxHeight=Math.min(height[left], height[rigth]);
			
//			8,49,18,40,16,15,4,6,49

			maxOfQuantityWater=Math.max(maxOfQuantityWater, width*maxHeight);
			//System.out.println(maxHeight+"*"+width+"="+(width*maxHeight));
			
			if(height[left]<height[rigth]) {
				left++;
				
			}else {
				rigth--;
			}
		}
		return maxOfQuantityWater;
	}

}
