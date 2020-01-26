
public class Main {

	public static void main(String[] args) {
		MyData a  = new MyData(7);// a=7
		MyData b  = new MyData(3);//b=3
		MyData c  = new MyData();
		MyData d  = new MyData();
		
		a.coppy(5);//a=5
		b.coppy(10);//b=10
		//add (............) 
		MyData f = MyData.add(10,20);
		c.coppy(MyData.add(5,6));//c=5+6
		c.coppy(MyData.add(a,b));//c=a+b
		//a.coppy(b);//a=b
		
		
	
	}

}
