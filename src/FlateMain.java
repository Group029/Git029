
public class FlateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flat home= new Flat();
		
		Location l1= new Location("Ambegoan",7500);
		home = new Flat("Aniket","3BHK",l1,750,5,false,false,6);
		
		Location l2 = new Location("Kothrude",4500);
		Flat banglow = new Flat("Vaibhav","5BHK",l2,1500,2,true,true,0);
		
		float Flatvalue= home.getAgreementCost();
		System.out.println("Total cost of Flate"+l1.getName()+" : " +Flatvalue);
		
		Flatvalue= banglow.getAgreementCost();
		System.out.println("Total cost of bunglow at"+l2.getName()+" : " +Flatvalue);

	}

}
