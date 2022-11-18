
public class Location {

	private String name;
	private int ratePerSquareFeet;
	
	public Location() {
		name = "Kothrude";
		ratePerSquareFeet = 2000;
	}
	public Location(String name, int ratePerSquareFeet) {
		this.name = name;
		this.ratePerSquareFeet = ratePerSquareFeet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRatePerSquareFeet() {
		return ratePerSquareFeet;
	}
	public void setRatePerSquareFeet(int ratePerSquareFeet) {
		this.ratePerSquareFeet = ratePerSquareFeet;
	}
	
}
