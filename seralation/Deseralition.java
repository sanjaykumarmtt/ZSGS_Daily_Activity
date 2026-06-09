package seralation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseralition {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fir=new FileInputStream("cat.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fir);
		
		Cat obj=(Cat) ois.readObject();
		
		System.out.println("Cat age is "+obj.age);
		System.out.println("Cat color is "+obj.color);
		System.out.println("Finesed.....");
		

	}

}
