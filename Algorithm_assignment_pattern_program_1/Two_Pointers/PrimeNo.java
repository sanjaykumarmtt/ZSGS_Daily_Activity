package Algorithm_assignment_pattern_program_1.Two_Pointers;

public class PrimeNo {
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			if(primeNo(i)) {
				System.out.println("This primNumber "+i);	
			}
		}
	}
	public static boolean primeNo(int i) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) return true;
		
		return false;
	}
}
