
public class Rectangle extends Shape {
	private double w;
	private double h;
	public Rectangle() {
		this.h = 0.0;
		this.w = 0.0;
	}
	public Rectangle(double w,double h) {
		this.h = h;
		this.w = w;
	}
	
@Override
	public double area () {
		return this.w*this.h;
	}
	public String toString() {  //  abstract method have to  @Override
	
	return "Rectangle";
	}

}
