package composition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("corvet", 2025, "V8");
		
		System.out.println(car1.model);
		System.out.println(car1.year);
		System.out.println(car1.engin.type);
	}
	
	public static class Car {
		String model;
		int year;
		Engin engin;
		
		Car(String model, int year, String enginType) {
			this.model = model;
			this.year = year;
			this.engin = new Engin(enginType) ;
		}
	}
	
	
	public static class Engin {
		
		String type;
		Engin(String type) {
			this.type = type;
		}
	}

}
