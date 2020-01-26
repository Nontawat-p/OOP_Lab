
public class AccountReceivable {
	private String id ;
	private String name;
	private double balance;
	private double maximumDeb;
	
	public AccountReceivable () {
		//constructor  เพื่อกำหนดค่าเริ่มต้นให้ฟิลล์
		//new AcountReceivable = it run to here
		this.id = "603020296-7";
		this.name = null;
		this.balance = 0;
		this.maximumDeb = 0;
	}
	public AccountReceivable (String id,String name){
		//Argument ค่าที่ส่งมา | Parameter ตัวรับ
		this.id = id;
		this.name = name;
	}
	public AccountReceivable(String id,String name,double maximum,double balance) {
		this.maximumDeb = maximum;
		this.balance = balance;
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setMaximum(double maximum) {
		this.maximumDeb = maximum;
	}
	public double getMaximum() {
		return this.maximumDeb;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setDebit(double bebit) {
		this.balance = this.balance+bebit;
		System.out.println("------------------------");
		System.out.println("Balance : "+balance);
	}
	public void setCrebit(double credit) {
		
				
	}


}
