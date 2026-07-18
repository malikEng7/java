package all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add(5);
//		list.add(4);
//		list.add(1);
//		//System.out.println(list.size());
//		
//		Collections.sort(list);		
//		System.out.println(list);
		
		String andex0 ;
		String andex1;
		String andex2;
		Scanner scanner = new  Scanner(System.in);
		ArrayList<String> user = new  ArrayList<>();
		
		System.out.println("enter the food you want just 3: ");
		andex0 = scanner.next();
		andex1 = scanner.next();
		andex2 = scanner.next();
		
		user.add(andex0);
		user.add(andex1);
		user.add(andex2);
		System.out.println(user);
		
		scanner.close();
	}
	
	
	

}
