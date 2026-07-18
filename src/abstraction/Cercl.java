package abstraction;

public class Cercl extends Shap {
	
	double  redic ;
	
	Cercl(double redic) {
		this.redic = redic;
	}
	
	
	@Override
	 double area() {
		return Math.PI * redic * redic;
	}
}
