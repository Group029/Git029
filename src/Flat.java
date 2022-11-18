public class Flat {
    private String ownerName;
    private	String flatType;
    private	Location locality;
    private float carpetArea;
    private	int floor;
     private boolean lift;
     private boolean reserevedParking;
     private int ageOfBuilding;
	
 	public Flat() {
		super();
		ownerName = "joshi";
		flatType = "3BHK";
		locality = new Location("kothrude",8000);
		carpetArea = 750;
		floor = 4;
		lift = false;
		reserevedParking = false;
		ageOfBuilding = 5;
	}
	public Flat(String ownerName, String flatType, Location locality, int carpetArea, int floor, boolean lift,
			boolean reserevedParking, int ageOfBuilding) {
		super();
		this.ownerName = ownerName;
		this.flatType = flatType;
		this.locality = locality;
		this.carpetArea = carpetArea;
		this.floor = floor;
		this.lift = lift;
		this.reserevedParking = reserevedParking;
		this.ageOfBuilding = ageOfBuilding;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public Location getLocality() {
		return locality;
	}
	public void setLocality(Location locality) {
		this.locality = locality;
	}
	public float getCarpetArea() {
		return carpetArea;
	}
	public void setCarpetArea(int carpetArea) {
		this.carpetArea = carpetArea;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public boolean isLift() {
		return lift;
	}
	public void setLift(boolean lift) {
		this.lift = lift;
	}
	public boolean isReserevedParking() {
		return reserevedParking;
	}
	public void setReserevedParking(boolean reserevedParking) {
		this.reserevedParking = reserevedParking;
	}
	public int getAgeOfBuilding() {
		return ageOfBuilding;
	}
	public void setAgeOfBuilding(int ageOfBuilding) {
		this.ageOfBuilding = ageOfBuilding;
	}
	public float getAgreementCost() {
		float BulitupArea= carpetArea + (0.25f*carpetArea);
		float flatValue= locality.getRatePerSquareFeet()*BulitupArea;
		float temp=flatValue;
		float temp1=0;
		
		if(lift==false) {
			if(floor>3)
			{
				temp=temp-(temp*0.02f); // 2%deduct 
			}
		}
		temp1=flatValue-temp; // 2L
		temp=flatValue;   //reset 1cr
		
		if(ageOfBuilding >5 && ageOfBuilding<10) {
			temp=temp-(temp*0.02f);  //98
			}
		else if(ageOfBuilding>10) {
			temp=temp-(temp*0.05f); //95
			}
		temp1=temp1 + (flatValue-temp); //2+(5L)
		temp=flatValue;//1cr
		if(reserevedParking==false) {
			temp=temp-150000; //98.5L
		}
		temp1=temp1+(flatValue-temp); //7+(1cr-98.5=1.5L)=8.5
		
		flatValue = flatValue-temp1;	// 1cr-8.5=91.5
	
		return flatValue;
	}

}
