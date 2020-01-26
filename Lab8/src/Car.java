
public class Car {
	private Engin engin;
	private String carId;
	private String owner;
	
	public Car() {
		this.engin = null;
	}
	public Car (String id, String series,String description,String carid,String owner) {
		this.engin = new Engin (id,series,description);
		this.carId = id;
		this.owner = owner;
	}
	public Engin getEngin() {
		return this.engin;
	}
	public String getEnginInfo() {
		String info  = String.format("Engine ID : %s\nSeries : %s\nDescription : %s\n"
				,this.engin.getID()
				,this.engin.getSeries()
				,this.engin.getDescription());
		return info;
	}

}
