
public class MyWebPage {
	private String  text ; //instance variable ��������ҧ���ͺ�����Ƿء��ͺ�礨е�ͧ�տ����  text ����
	private  static int count =0; //class variable  ���� ����âͧ����  ��������ҧ�ͺ�红����  count ������§��������������ѹ 㹤��� 
									//������¹�ŧ����   **  ��Ҩ���ҧ�֧ ���� !!! ���  this �������繪��� ����᷹ ���¶֧������ѹ����
	private String msg;
	/*public void visiting() {
		count++;
	}*/
	public static void visiting() {//����÷������¡��� ���ʹ static �е�ͧ��� class variable
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
