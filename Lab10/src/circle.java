
public class circle extends Shape {
	private double radius;
	public circle() {
		this.radius = 0.0;
	}
	public circle(double r) {
		this.radius = r;
	}
	@Override	//������  @  ���¡���  annotation type
	public  double area() {
		
		return Math.PI * this.radius*this.radius;
	}
	public String toString() {
		System.out.println(super.toString());  //  ���¡�����ʹ�������  super is a Shape class  ����ͧ @Override ���з��������� �����  abstract
		return "circle";
	}

}
