
public class Triangle implements IArear {
//interface ก็สามารถสืบทอดกันได้
	private double base;
	private double hig;
	@Override
	public double area() {
		return 0.5*this.base*this.hig;
	}
	public Triangle() {
		this.base = 0.0;
		this.hig = 0.0;
	}
	public Triangle(double b,double h) {
		this.base = b;
		this.hig = h;
	}

}
