package leetcode_Daily_problems.Week_4_leetcode_problem;

public class BinarySearch_704 {

	public static void main(String[] args) {
		
		int nums[] = {-1,0,3,5,9,12}, target = 9,
			nums1[] = {-1,0,3,5,9,12}, target1 = 2,temp[]= {2,3,5,9}, k = 2;
		
		minCapability(temp,k);
		
//		System.out.println(search(nums,target));
//		System.out.println(search(nums1,target1));

	}
	public static int search(int[] nums, int target) {
		int left=0,right=nums.length-1;
		
		while(left<right) {
			
			int mid=(right+left)/2;
			
			if(nums[mid]==target) {
				return mid;
			}else if(mid<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
			
		}
		
		
		return -1;
	}
	    public static int minCapability(int[] nums, int k) {
	        int n = nums.length;
	        
	        // 1. Binary Search-க்கான எல்லைகளை (Range) முடிவு செய்தல் [2,3,5,9], k = 2
	        int low = Integer.MAX_VALUE;
	        int high = Integer.MIN_VALUE;
	        for (int num : nums) {
	            low = Math.min(low, num);
	            high = Math.max(high, num);
	        }

	        int result = high;
	        System.out.println(low+" "+high);

	        // 2. Binary Search ஆரம்பம்
	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            // 3. Greedy முறையில் இந்த 'mid' (டார்கெட்) சாத்தியமா எனப் பார்த்தல்
	            if (canRob(nums, k, mid)) {
	                result = mid; // சாத்தியம் என்றால், விடையைச் சேமித்துவிட்டு 
	                high = mid - 1; // இன்னும் குறைந்த விலையில் திருட முடியுமா எனப் பார்
	            } else {
	                low = mid + 1; // சாத்தியமில்லை என்றால், டார்கெட்டை அதிகப்படுத்து
	            }
	        }
        return result;
	    }

	    // 4. Greedy Helper Function
	    private static boolean canRob(int[] nums, int k, int target) {
	        int count = 0;
	        for (int i = 0; i < nums.length; ) {
	            // ஒரு வீடு டார்கெட்டுக்குள் இருந்தால் அதைத் திருடு (Greedy choice)
	            if (nums[i] <= target) {
	                count++;
	                i += 2; // அடுத்த வீட்டைத் தவிர்க்க 2 வீடுகள் தள்ளு (Jump)
	            } else {
	                i++; // இந்த வீடு டார்கெட்டை விட அதிகம், அடுத்த வீட்டைப் பார்
	            }
	            
	            // k வீடுகள் கிடைத்துவிட்டால் உடனே 'true' எனத் திரும்பு
	            if (count >= k) return true;
	        }
	        return false;
	    }
}