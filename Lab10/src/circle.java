
public class circle extends Shape {
	private double radius;
	public circle() {
		this.radius = 0.0;
	}
	public circle(double r) {
		this.radius = r;
	}
	@Override	//การเติม  @  เรียกว่า  annotation type
	public  double area() {
		
		return Math.PI * this.radius*this.radius;
	}
	public String toString() {
		System.out.println(super.toString());  //  เรียกใช้เมธอดคลาสแม่  super is a Shape class  ไม่ต้อง @Override เพราะที่คลาสแม่ไ ไม่มี  abstract
		return "circle";
	}

}
