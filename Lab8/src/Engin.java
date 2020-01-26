
public class Engin {
	private String id;
	private String series;
	private String description;
	
	public Engin (){
		this.id = null;
		this.series = null;
		this.description = null;
	}
	public Engin (String id,String series,String description) {
		this.id = id;
		this.series = series;
		this.description = description;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getID() {
		return this.id ;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSeries() {
		return this.series;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return this.description ;
	}
}
