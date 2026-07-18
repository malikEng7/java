package theFirst;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.println("Enter you name: ");
		name = scanner.nextLine();
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		

//		chiker the name
		if(name.isEmpty()){
			System.out.println("triy agen ");
		}
		
		
		if(age >= 19) {
			System.out.println("You are a man ");
		}
		else if(age < 0){
			System.out.print("you not born yet!");
		}
		else {
			System.out.print("you ch");
		}
		scanner.close();

	}

}
