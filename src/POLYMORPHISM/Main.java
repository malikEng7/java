package POLYMORPHISM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// POLYMORPHISM 
		Bike bike = new Bike();
		Car car = new Car();
		
		Vehicel[] area = {car, bike};
		
		for(Vehicel vehicel: area) {
			vehicel.go();
		}
		
		
		
		// runtime POLYMORPHISM 
		Vehicel vehicel;
		
		Scanner scanner = new  Scanner(System.in);
		
		System.out.print("choice 1 == car , 2 == Bike :");
		int choice = scanner.nextInt();
		if(choice == 1) {
			vehicel = new Car();
			vehicel.go();
		}
		else if(choice == 2) {
			vehicel = new Bike();
			vehicel.go();
		}
		
		
	}

}
