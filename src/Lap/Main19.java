package Lap;

import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double num1;
		double num2;
		char opration;
		double result = 0;
		boolean validOperetion = true;
		
		System.out.print("Enter farst number: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Chooise the opration(+,-,*,/): ");
		opration = scanner.next().charAt(0);

		System.out.print("Enter Sacound number: ");
		num2 = scanner.nextDouble();
		
		switch(opration) {
		case '+' -> result = num1 + num2;
		case '-' -> result = num1 - num2;
		case '*' -> result = num1 * num2;
		case '/' -> {
			if(num2 == 0) {
				System.out.print("you cannat divid by 0😎");
				validOperetion = false;
			}
			else {
				 result = num1 / num2;
			}
		  }
		default -> {
			System.out.print("invalid operator");
			validOperetion = false;
		}
		}
		
		if(validOperetion) {
			System.out.print(result);
		}
		
		scanner.close();
		
		
	}

}
