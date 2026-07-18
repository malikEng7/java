package theFirst;

public class Main012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 boolean isStudent = false;
	 boolean isSenior = true;
	 double price = 9.99;
		
		
		
		if (isStudent) {
			if(isSenior) {  
				System.out.println("you get a Senior discount 20% is");
				System.out.println("you get a Student discount 10% is " );
				price = price * 0.7;
			}
			
			
			else {
				System.out.println("you get a Student discount 10% is " );
				price = price * 0.9;
			}
		}
		
		else{
			
			if(isSenior) {
				System.out.println("you get a Senior discount 20% is ");
				
				price = price * 0.8;
			}
			
			else {
				System.out.println("you get no thing");
			}
		}
		
		
		System.out.printf("the price of ticket is: $%.3f", price);

	}

}
