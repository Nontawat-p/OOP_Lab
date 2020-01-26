
public class DailyEmployee extends Employee {
	private double wage;
	private int nDay;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getnDay() {
		return nDay;
	}
	public void setnDay(int nDay) {
		this.nDay = nDay;
	}
	@Override
	public double earnReciving() {
		return wage*nDay;
	}
	public DailyEmployee(String id,String name,String tel,double wage,int nDay) {
		super(id,name,tel);
		this.nDay = nDay;
		this.wage = wage;
	}
}
