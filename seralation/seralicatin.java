package seralation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class seralicatin {

	public static void main(String[] args) throws IOException {	
		Cat cat=new Cat(8,"Withe");
		
		
		FileOutputStream faile=null;
		ObjectOutputStream oos=null;
		try {
			
			faile=new FileOutputStream("cat.txt");
			oos=new ObjectOutputStream(faile); 
			oos.writeObject(cat);	
			System.out.println("Srealation is compleate");
			
		}catch(IOException e) {
			throw new RuntimeException();
		}finally{
			faile.close();
			oos.close();
		}
		
	}

}
