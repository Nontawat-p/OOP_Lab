
public class MonthlyEmployee extends Employee {
	private double wage;
	private String Position;
	@Override
	public double earnReciving() {
		return wage;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public MonthlyEmployee (double wage) {
		this.wage = wage;
	}
}
