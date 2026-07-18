package object;

public class Student {
	private String name;
	private int age ;
	private double gpa ;
	
	
	Student(String name, int age, double gpa){
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	
	String getName() {   // Getter  قراءة
		return this.name;
	}   
	
	int getAge() { 	// Getter  قراءة
		return this.age;
	}
	

	
	void setName(String name) {		// Setter   تعيين قيم 
		this.name = name;
	}
	
	void setAge(int age) {		// Setter   تعيين قيم 
		this.age = age;
	}
	
	
}
