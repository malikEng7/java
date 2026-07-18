package theFirst;

import java.util.Scanner;

public class Array032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String[] fooss = {"appew", "banna", "tea"};
		int num = 0;
		String[] foods;
		
		
		System.out.print("what # of food do you want?: ");
		num = scanner.nextInt();
		foods = new String[num];

		
		for(int t=0; t < foods.length; t++) {
			System.out.print(t);
			System.out.print(" anter the food name: ");
			foods[t] = scanner.next();
		}
		
		
		for(int i=0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
		scanner.close();
	}

}
