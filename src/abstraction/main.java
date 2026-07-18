package abstraction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercl cercl = new Cercl(6.19);
		Triangel triangel = new Triangel(6, 10);
		Rectangle rectangle = new Rectangle(5, 2);
		
		
		cercl.display();
		triangel.display();
		rectangle.display();
		System.out.println("##########");
		System.out.println(cercl.area());	
		System.out.println(rectangle.area());
		System.out.println(rectangle.area());

		
		
	
	}

}
