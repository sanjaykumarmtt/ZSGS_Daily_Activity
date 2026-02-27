package leetcode_Daily_problems;
import java.util.*;

public class demo {
	public static void main(String[] argin) {
		a s=a.getInstent1(10);
		//a x=new a(10);
		
		List<Integer> triangle =new ArrayList<>();
		triangle.add(1);
		triangle.add(2);
		triangle.add(3);
		
		for(int a:triangle) {
			System.out.println(a);
			
		}
		s.c();
	}
}
class a{
   //static a d=new a();
	int a;
	private a(int a) {
		this.a=a;
	}
	
//	static a getInstent() {
//		return d;
//	}
	static a getInstent1(int a) {
		return new a(a);
	}	
	 void c() {
		System.out.println("hello "+a);
	}
}