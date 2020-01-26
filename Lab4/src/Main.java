
public class Main {
	//การเขียนนอกฟังก์ชันจะเป็นฟิลล์เท่านั้น!!
	public static void main(String[] args) {
		//การเรียกใช้ constructor ไม่ต้อง ประการตัวแปรก็ได้
		AccountReceivable ac = new AccountReceivable();
		ac.setName("Notawat");
		ac.setBalance(20000);
		ac.setMaximum(500000);
		System.out.println("Account ID :"+ac.getId()+"\n"+"Account Name :"+
							ac.getName()+"\n"+"Balance :"+ac.getBalance()+
							"\n"+"MaximumDep :"+ac.getMaximum());
		ac.setDebit(10000);
	}
	

}
