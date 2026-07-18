package Lap;

import java.util.Scanner;

public class Bank029 {
	
	static Scanner scanner  = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double balance = 0; 
		boolean isRunning = true;
		int choice;
		
		while(isRunning) {
			System.out.println("******************");
			System.out.println("BANKING PROGRAM");
			System.out.println("******************");
			System.out.println("1. SHOW Balance");
			System.out.println("2. Deposit");
			System.out.println("3. withdraw");
			System.out.println("4. Exit");
			System.out.println("******************");
			System.out.println("your choose is (1-4): ");
			choice = scanner.nextInt();

	
			switch(choice) {
				case 1 -> showBalance(balance);
				case 2 -> balance += deposit();
				case 3 -> balance -= withdraw(balance);
				case 4 -> isRunning = false;
				default -> System.out.println("invalid choice");
			}
		
		}
		
		System.out.println("thank you have a nice day!");
		// exit message
		
		
		scanner.close();
	}
		static void showBalance(double balance) {
			System.out.println("******************");
			System.out.printf("$%.2f\n", balance);
	}
		
		static double deposit(){
			double amount;
			
			System.out.println("Enter the amount: ");
			amount = scanner.nextDouble();
			
			if(amount < 0) {
				System.out.println("you can't put negative");
				return 0;
			}
			else {
				return amount;
				
			}
		
			
			
		}
		static double withdraw(double balance) {
			double amount ;
			System.out.println("Enter the amount to be withdraw: ");
			amount = scanner.nextDouble();
			
			if(amount > balance){
				System.out.println("insufficient funds");
				return 0;
			}
			else if(amount < 0) {
				System.out.println("amount can't be negative");
				return 0;
			}
			else {
				return amount;
			}
			
			
			
		}
}
