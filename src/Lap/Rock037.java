package Lap;

import java.util.Random;
import java.util.Scanner;


public class Rock037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] chiose = {"rock", "paper", "scissors"};
		String userChiose;
		String computer ;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Enter your chiose(rock paper scissors): ");
		userChiose = scanner.nextLine().toLowerCase();
		
		if(!userChiose.equals("rock") && !userChiose.equals("paper") && !userChiose.equals("scissors")) {
			System.out.println("Rowing valu");
		}
		
		computer = chiose[random.nextInt(3)];
		System.out.printf("the  computer chioce is: %s \n", computer);

		if(userChiose.equals(computer) ) {
			System.out.println("your tie");

		}
		else if(userChiose.equals("rock") && computer.equals("scissors") 
			  || userChiose.equals("paper") && computer.equals("rock")
			|| userChiose.equals("scissors") && computer.equals("paper")) {
			System.out.println("your the  winaer");
		}
		else{
			System.out.println("the computer is the winaer");

		}
		
		
		
		
		scanner.close();
	}

}
