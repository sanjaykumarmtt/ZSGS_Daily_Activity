package Algorithm_assignment_pattern_program_1;

public class TrappingRainWater42 {

	public static void main(String[] args) {
		int height[] = {4,2,0,3,2,5},
			height1[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(trap(height));
		System.out.println(trap(height1));
	}
	public static int trap(int[] height) {
		
		int left=height[0],
			totalTrapWatter=0;
		int[] reght=new int[height.length];
		
		reght[height.length-1]=height[height.length-1];
		for(int i=height.length-2;i>=0;i--) {
			reght[i]=Math.max(reght[i+1], height[i]);
		}
		
		for(int i=0;i<height.length;i++) {
			int minValue=Math.min(left, reght[i]);
			int temp=Math.max(0, minValue);
			totalTrapWatter+=temp-height[i];
			
			left=(height.length>i+1)?Math.max(left,height[i+1]):left;
		}
		
		return totalTrapWatter;
	}
}
