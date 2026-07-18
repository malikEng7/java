package theFirst;

import java.util.Random;
import java.util.Scanner;

public class diceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		Random random = new Random();
		
		int numOfDice ;
		int total = 0;
		
		System.out.println("Enter the number of dic to roll: ");
		numOfDice = scanner.nextInt();
		
		if(numOfDice > 0) {
			
			for(int i = 0 ; i < numOfDice; i++) {
				int roll = random.nextInt(1, 7);
				dic(roll);
				System.out.println("you rolled: " + roll);
				total += roll ;
			}
			System.out.println("total: " + total);
		}
		
		else {
			System.out.println("you cannot roll number last than 0");
		}

	}
	
	static void dic(int roll) {
		String dic1 = """
			    -----
			   |     |
			   |  ●  |
			   |     |
				-----

				""";
		String dic2 = """
			    -----
			   | ●   |
			   |     |
			   |   ● |
				-----
				
				""";
		String dic3 = """
			    -----
			   | ●   |
			   |  ●  |
			   |   ● |
				-----
				
				""";
		String dic4 = """
			    -----
			   | ● ● |
			   |     |
			   | ● ● |
				-----
				
				""";
		String dic5 = """
			    -----
			   | ● ● |
			   |  ●  |
			   | ● ● |
				-----
				
				""";
		String dic6 = """
			    -----
			   | ● ● |
			   | ● ● |
			   | ● ● |
				-----
				
				""";
		switch(roll) {
			case 1 -> System.out.print(dic1);
			case 2 -> System.out.print(dic2);
			case 3 -> System.out.print(dic3);
			case 4 -> System.out.print(dic4);
			case 5 -> System.out.print(dic5);
			case 6 -> System.out.print(dic6);
		}
	}

}
