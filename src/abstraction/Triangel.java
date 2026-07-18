package abstraction;

public class Triangel extends Shap {
	
	double base;
	double height;
	
	Triangel(double  base, double  height) {
		this.base = base;
		this.height = height;
	}
	
	@Override 
	double area() {
		return 0.5 * base * height;
	}
	
}
