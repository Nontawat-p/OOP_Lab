public class Calculator {
	private int var1;
	private double result;
	public Calculator () {
		System.out.println("Calculator()");
	}
	public Calculator (int var1) {
		this.var1 = var1;
		System.out.println("Calculator(int x)");
	}
	public void setVal(int var1) {
		//setter
		this.var1 = var1;
	}
	public int getVal() {
		//getter
		return this.var1;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double getResult() {
		return this.result;
	}
	
	public void add(double x,double y) {
		System.out.println(x+y);
	}
	
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public double add1(double f , double g) {
		double j = g+f;
		return j;
	}
	
	public void show () {
		System.out.println(this.var1);
	}
}
