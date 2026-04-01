package my.library;

import java.util.Scanner;

public class InputBox{
	 Scanner s=new Scanner(System.in); 
	 
	 
	public String setInput() {
		
		s.next();
		s.nextInt();
		
		return s.nextLine();
	}
	
}