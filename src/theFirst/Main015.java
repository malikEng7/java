package theFirst;
import java.util.Scanner;

public class Main015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int choice ;
		double weight ;
		double newWeight ;
		
		System.out.println("Weight Conversion program");
		System.out.println("1: Convert lbs to kgs");
		System.out.println("2: Convert kgs to lbs");
		System.out.print("Choose an option: ");
		choice = scanner.nextInt();

		
		
		if(choice == 1) {
			System.out.print("Enter the lbs:");
			weight = scanner.nextDouble();
			newWeight = weight * 0.453 ;
			System.out.print("the  kgs is: " + newWeight );
		}
		
		else if(choice == 2) {
			System.out.print("Enter the kgs:");
			weight = scanner.nextDouble();
			newWeight = weight * 2.204 ;
			System.out.print("the  lbs is: " + newWeight );
		}
		
		else {
			System.out.print("your choose is  wrong ");
		}
		

		
		scanner.close();
	}

}
