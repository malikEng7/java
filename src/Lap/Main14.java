package Lap;
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String Email;
		String username;
		String domain;
		
		System.out.println("Enter your Email: ");
		Email = scanner.nextLine();
		
		if(Email.contains("@")) {
			username = Email.substring(0, Email.indexOf("@"));
			domain = Email.substring(Email.indexOf("@") + 1);
			System.out.println(username);
			System.out.println(domain);
		}
		else {
			System.out.println("not Valad");

		}
		scanner.close();

	}

}
