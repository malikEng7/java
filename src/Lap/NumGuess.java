package Lap;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); 
		Scanner scanner = new Scanner(System.in);
		
		int gusse;
		int randomNum = random.nextInt(1, 11);
		int attempts = 0;
		
		System.out.println("GAME of gusse");
		
		
		do {
			System.out.println("enter the  num you guss: ");
//			System.out.println( "the ran...is " + randomNum);
			gusse = scanner.nextInt();
			attempts++ ;

		}while(gusse != randomNum);
			
		System.out.println("You are won ");
		
		System.out.println(attempts);
		scanner.close();
	}

}
