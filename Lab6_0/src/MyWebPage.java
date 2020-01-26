
public class MyWebPage {
	private String  text ; //instance variable เมื่อสร้างเป็นออบเจ็คแล้วทุกๆออบเจ็คจะต้องมีฟิลล์  text เสมอ
	private  static int count =0; //class variable  หรือ ตัวแปรของคลาส  เมื่อสร้างออบเจ็บขึ้นมา  count จะมีเพียงตัวเดียวใช้ร่วมกัน ในคลาส 
									//ใครเปลี่ยนแปลงก็ได้   **  ถ้าจะอ้างถึง ห้าม !!! ใส่  this ให้ใส่เป็นชื่อ คลาสแทน หมายถึงว่ามีอันเดียว
	private String msg;
	/*public void visiting() {
		count++;
	}*/
	public static void visiting() {//ตัวแปรที่จะเรียกใช้ใน เมธอด static จะต้องดป็น class variable
		count++;
	}
	public int getcount () {
		return count;
	}
	public void setText (String text) {
		this.text = text;
	}
	public String getText () {
		return this.text;
	}
	public void inFo() {
		String tmp = "The number of visitors of this page is "; //tmp is local variable  
		this.msg = String.format("%s %d", tmp,count); //method format is static function
	}
	public String getInfo() {
		return msg;
	}
	public void show() {
		System.out.println("This page has all visitors "+count);

	}
}
