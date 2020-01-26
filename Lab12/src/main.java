
public class main {

	public static void main(String[] args) {
		
		DailyEmployee d = new DailyEmployee("id001","NONTAWAT","089655635",250,27);
		MonthlyEmployee m = new MonthlyEmployee(25000);	
		Calculator cal = new Calculator();
		System.out.println(cal.gatSalary(d));
		System.out.println(cal.gatSalary(m));
		d.setnDay(15);
		System.out.println(cal.gatSalary(d));
	}
}
