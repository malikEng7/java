package toString;

public class Object {
	String make; 
	String model;
	int year;
	String color;
	
	Object(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
		
	@Override
	 public String toString() {
		 return this.make + " " + this.model + " " + this.year + " " + this.color ;
	 }
}	
