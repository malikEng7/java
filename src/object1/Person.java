package object1;

public class Person {
	
	 String first;
	 String last;
	
	Person(String first, String last){
		this.first = first ;
		this.last = last;
	}
	
	void showeperson() {
		System.out.println(this.first + " " + this.last );
	}
	
	
	
	void for_Override() { // Just to know @Override 
		System.out.println("if you take this  methode you are stuped");
	}
}
