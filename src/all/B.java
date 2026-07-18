package all;
import java.util.InputMismatchException;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			System.out.println("Enter a number: ");
			Scanner scanner = new  Scanner(System.in);
			int num = scanner.nextInt();
			System.out.println(num);
		}
		catch(InputMismatchException e) {
			System.out.println("that wos'n a number");
		}
		catch(ArithmeticException e) {
			System.out.println("DON'T DEVIDE BY 0");
		}
		
	}

}
