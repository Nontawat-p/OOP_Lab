import java.time.LocalDate;

public class Invoice {
	private String id;
	private String date;
	private double amount;
	private int vat;
	private static int countId =1;

	public Invoice(LocalDate date ,int amount ) {
		this.date = date.toString();
		this.amount = amount;
		vat();
		Id();
		countId ++;
	}
	public void vat () {
		vat = (int) ((amount * 7) /100);
	}	
	public void Id () {
		 id =String.format("Inv-%04d", countId)	;	
	}
	public String getInformation() {
		String show = String.format("ID: %s  Date: %s Amount : %.2f  Vat : %d",id,date,amount,vat);
		return show;
	}
}
