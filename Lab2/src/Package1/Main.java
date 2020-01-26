package Package1;
import Package2.B;
import Package2.Student;
public class Main {
	public  static void main(String[]args) {
		A a = new A();
		//a.var1 = 10;
		a.var2 = "Object";
		a.var3 = 5.3;
		a.Display();
		
		B b = new B();
		b.Display();
		
		Student std1 = new Student();
		std1.id= "603020296-7";	
		std1.name = "Nontawta prathumma";
		std1.email = "maxnontawat2556@gmail.com";
		std1.Display();
		}
	
}
