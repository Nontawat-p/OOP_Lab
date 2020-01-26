import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		Invoice inv1 = new Invoice(LocalDate.of(2018, Month.FEBRUARY, 14), 2500);
		System.out.println(inv1.getInformation());
		Invoice  inv2 = new Invoice( LocalDate.of(2018, Month.FEBRUARY, 15),3500 );
		System.out.println(inv2.getInformation());

	
	}
	

}
