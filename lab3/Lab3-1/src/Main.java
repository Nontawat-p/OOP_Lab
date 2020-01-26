public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();  //ต้องสร้างเพื่อเรียกใช้ คลาส
		cal.show();
		cal.add(1, 5);
		cal.add(10.5, 11.5);
		double result = cal.add1(10.5, 15.5);
		System.out.println(result);
		Calculator c = new Calculator(510);
		cal.show();
		System.out.println(c.getVal()+"\t"+c.setVal());
		//System.out.println(c.getresult()+"\t"+c.get());
	}

}
//constructor name same class 