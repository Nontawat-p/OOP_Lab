
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWebPage page1 = new MyWebPage();
		MyWebPage page2 = new MyWebPage();
	
		MyWebPage.visiting();
		MyWebPage.visiting();
		MyWebPage.visiting();
		MyWebPage.visiting();
		MyWebPage.visiting();
		MyWebPage.visiting();
		page1.inFo();
		page2.inFo();
		System.out.println(page1.getInfo());
		System.out.println(page2.getInfo());
	}

}
