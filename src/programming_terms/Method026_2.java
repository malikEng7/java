package programming_terms;

public class Method026_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Spongboob";
		int age = 32;
		
		methodName(name, age);
		
		double resolat = squar(3);
		System.out.println(resolat);
		
	}

	static void methodName(String name, int age) {
		System.out.println("your name is " + name + "your age is " + age);
	}
	static double squar(double num) {
		return num * num ;
	}
	
	
}
