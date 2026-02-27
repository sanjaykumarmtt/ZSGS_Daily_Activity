package Algorithm_assignment_pattern_program_1.Two_Pointers;

import java.util.Arrays;

public class BagofTokens_948 {

	public static void main(String[] args) {
		int tokens[] = {100,200,300,400},power = 200,
			tokens1[] = {100}, power1 = 50,
			tokens2[] = {200,100}, power2 = 150;
		System.out.println(bagOfTokensScore(tokens,power));
		System.out.println(bagOfTokensScore(tokens1,power1));
		System.out.println(bagOfTokensScore(tokens2,power2));
	}

	public static int bagOfTokensScore(int[] tokens, int power) {
		
		Arrays.sort(tokens);
		int left=0,
			right=tokens.length-1,
			score=0;
		
		while(left<=right) {
			
			if(tokens[left]<=power) {
				power-=tokens[left];
				left++;
				score++;
			}else if((right-left)>1 && score>0) {
				power+=tokens[right];
				score--;
				right--;
			}else {
				break;
			}
			
		}
		
		
		return score;
	}

}
