package programming_terms;

public class Method026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = square(3);
		System.out.println("method1 " + result);
		
		
		happayNewYars();
		happayNewYars();
		happayNewYars();
		
	
		System.out.println("for getFullName \n" + getFullName("malik", "moss"));
		
		double tall = 16.4;
		double ard = 9;
		double totall = calculatePerimeter(tall, ard);
		System.out.println(totall + "\n");
		
		
		int  age = 11;
		ageCheak(age);
		System.out.println(ageCheak(age));
	}
	

	
	static double square(double number) // the num method resev is double
	{
		return number * number; // will return to main method 
		}
	static void happayNewYars () {
		System.out.println("habay barth day mr");
		System.out.println("habay barth day mr");
		System.out.println("habay barth malik and \n");
	}
	
	
	static double calculatePerimeter(double Newtall ,double newArd) {
		return (( Newtall + newArd ) *2);
	}
	
	static String getFullName(String first, String last) {
		return first + " " + last ;
	}
	
	static boolean ageCheak(int age) {
		if(age <= 10){
			return true;
		}
		else {
			return false;
		}
	}

}
