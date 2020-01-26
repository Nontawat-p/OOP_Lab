
public class Cubic implements IArear , Volume{

	private double side;
	@Override
	public double area() {
		return Math.pow(side, 3);
	}
	@Override
	public double volume() {
		return Math.pow(this.side, 3);
	}
	public Cubic(double s) {
		this.side  =s;
	}

	public Cubic() {
		this.side  =0.0;
	}
}
