package leetcode_Daily_problems.Week_4_leetcode_problem;

import java.util.ArrayList;
import java.util.List;

public class CalculateMoneyLeetcodeBank1716 {

	public static void main(String[] args) {
		
		int n = 4
			,n1=10,
			n2=20;
		System.out.println(totalMoney(n));
		System.out.println(totalMoney(n1));
		System.out.println(totalMoney(n2));
	}
	 public static int totalMoney(int n) {
	        List<Integer> weke = new ArrayList<>();
	        int hercyTotalamount = 0;
	        while (n > 7) {
	            n = n - 7;
	            if (n > 7) {
	                weke.add(7);
	            } else {
	                weke.add(7);
	                weke.add(n);
	                n = 0;
	            }
	        }
	      //  System.out.println(weke);
	        if(n!=0) weke.add(n);

	        for(int i=0;i<weke.size();i++){
	            hercyTotalamount+=CalculateMoneyLeetcodeBank(i+1,weke.get(i));
	        }
	        return hercyTotalamount;

	    }
	    public static int CalculateMoneyLeetcodeBank(int weke,int totalDay){
	        int money=0,
	            i=weke;
	        // System.out.println(weke+" "+totalDay);
	        while(totalDay!=0){
	            money+=i;
	            i++;
	            totalDay--;
	        }
	       // System.out.println(money);
	        return money;
	    }

}
