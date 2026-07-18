package all;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class D59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = "C:\\Users\\10tvt\\Desktop\\JAVA\\test2.txt";
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			System.out.println("that file excet");
		}
		catch(FileNotFoundException e){
			System.out.println("you hava a worng");
		}
		catch(IOException e) {
			System.out.println("you have a public exception");
		}
		
	}

}
