package HackerRankProblem.Week_1;

import java.util.ArrayList;
import java.util.List;

class a {

	public  void sum(int a, int b) {
		System.out.println(a+" "+b);
	}

	public void sum(int a, int b,int c) {
		System.out.println(a+" "+b+" "+c);
	}

	public void sum(int a, int b,int c,int d) {
		
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}

class b extends a{
	
	public static void sum(int a, int b) {
		System.out.println(a+" "+b);
	}
}

public class Demo {
	public static void main(String[] args) {
//		b a=new b();
//		a.sum(10, 20);
//		a.sum(30, 40, 70);
//		a.sum(70, 30,10,40);
		List<String> list=new ArrayList<>();
		list.add("Snajay k");
		list.add("kumar");
		list.add("sanjaykumar");
		list.add("saran");
		
		for(String temp:list) {
			System.out.println(temp);
		}
	}
}
