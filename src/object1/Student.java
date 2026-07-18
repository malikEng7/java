package object1;

public class Student extends Person {
		
	double gpa;
	
	
	Student(String first, String last, double gpa){  // like you seen there super refers to "person class"
		super(first, last);
		this.gpa = gpa;
	}
	
	void showeStudent() {
		System.out.println(this.first +  "the gpa is: " + this.gpa);
	}
	
	
	@Override 
	void for_Override() { // Just to know @Override
		System.out.println("i take your methode mather f*ck");
	}
	
	
}
