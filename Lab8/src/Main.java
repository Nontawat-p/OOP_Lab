
public class Main {

	public static void main(String[] args) {
	 //composition 
		Engin j = new Engin();
		Car mycar  = new Car("en001","a123"," - ","car001","JJ");
		System.out.println(mycar.getEnginInfo());
		mycar  = new Car("en002","a456"," - ","car002","KK");
		System.out.println(mycar.getEnginInfo());
		
		Engin k = mycar.getEngin();
		System.out.println(k);
	}

}
