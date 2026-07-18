package object;

public class Car {
	
	 String name = "blazer";
	String modal = "Chiafar";
	int year = 2005;
	boolean isRuning = false;
	
	void start() {
		System.out.println("the car run new");
		isRuning = true;
	}
	
	void stop() {
		System.out.println("the car not run new");
		isRuning = false;
		
	}
}
