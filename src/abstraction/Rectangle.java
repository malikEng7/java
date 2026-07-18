package abstraction;

public class Rectangle extends Shap {
	
	double  lenth;
	double 	weidth;
	
	Rectangle(double lenth, double weidth) {
		this .lenth = lenth;
		this.weidth = weidth;
	}
	
	
	@Override
	double area() {
		return lenth * weidth;
	}
}
