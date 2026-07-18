package theFirst;
import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String resonse = "";
		
	while(!resonse.equals("Q")){
		System.out.println("yiu are playing new");
		System.out.print("enter q to quit: ");
		resonse = scanner.next().toUpperCase();
		
	}
	System.out.println("you quit the game");
		
		
	}

}


//int age = 0;
//
//System.out.print("Enter your age: ");
//age = scanner.nextInt();
//
//while(age < 0) {
//	System.out.println("your age cannot be negative!");
//	System.out.print("Enteer you age: ");
//	age = scanner.nextInt();
//}
//
//System.out.print("your age is " + age);
//scanner.close();