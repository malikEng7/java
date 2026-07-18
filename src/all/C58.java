package all;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class C58 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		
		try(FileWriter writer = new FileWriter("C:\\Users\\10tvt\\Desktop\\JAVA\\text.txt")) {
			writer.write("i like  pizz\nit really good\nbuy me pizz");
			System.out.println("file  has been written");
		}
		catch(FileNotFoundException e) {
			
		}
		catch(IOException e) {
			System.out.println("could not write file");
		}
		
	}

}
