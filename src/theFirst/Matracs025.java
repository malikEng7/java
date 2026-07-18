package theFirst;

import java.util.Scanner;

public class Matracs025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		char symbol = ' ';
		 
		System.out.print("Enter the num of row: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter the num of columns: ");
		int columns = scanner.nextInt();
		
		System.out.print("Enter the symbol: ");
		symbol = scanner.next().charAt(0);
		
		
		for(int i = 0; i <rows; i++) {
			for(int j=0; j <columns; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
