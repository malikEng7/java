package object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call class car 
		Car car = new Car();
		Student student = new Student("malik", 30, 2.5);
		Student student2 = new Student("sultan", 32, 1.7);
		
		student.setAge(600);
		
		
		
		
		System.out.println(student.age);
		
		
//		System.out.println(car.name);
//		System.out.println(car.isRuning);
//		car.start();
//		System.out.println(car.isRuning);
//		car.stop();
//		System.out.println(car.isRuning);
//		
		
		
		
	}

}
