package seralation;

import java.io.Serializable;

class Cat implements Serializable{
	transient int age;
	String color;
	
	public Cat(int age, String color) {
		
		this.age = age;
		this.color = color;
	}
}

public class TowSum_I_I {

	public static void main(String[] args) {
	

	}
}
