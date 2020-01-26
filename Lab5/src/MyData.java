
public class MyData {

	private  int data;
	public MyData() {
		
	}
	public MyData (int data) {
		this.data = data;
	}
	public void coppy (int c) {
		this.data = c;
	}
	public void coppy (MyData j) {
	MyData l = j;
	System.out.println(l.data);
	}
	public static MyData add (int g ,int f) {
		MyData sp = new MyData();
		sp.data = g+f;
		return sp;
	}
	public  static MyData add (MyData a ,MyData b) {
		MyData s = new MyData();
		s.data = a.data+b.data;
		return s;
	}
}

