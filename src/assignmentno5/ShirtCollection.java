package assignmentno5;

public class ShirtCollection {
	
	public static Shirt shirts[];

	public static Shirt[] getShirts() {
		return shirts;
	}

	public static void setShirts(Shirt[] shirts) {
		ShirtCollection.shirts = shirts;
	}
	
	public static void showAllShirts(String type) {
		for (Shirt sh: ShirtCollection.shirts) {
			if(sh.getType().equals(type)) {
				System.out.println(sh.toString());
			}
		}
	}
	public static void showAllShirts(int minPrice, int maxPrice) {
		boolean flag=false;
		for(Shirt sh: ShirtCollection.shirts) {
			if(sh.getPrice()>=minPrice && sh.getPrice()<=maxPrice) {
				System.out.println(sh);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Shirt is not available within given Price range");
	}
	
	public static boolean isShirtAvailable(Shirt shirt) {
		for(Shirt shirt1: ShirtCollection.shirts) {
			if(shirt1.equals(shirt)) {
				return true;
			}
		}
		return false;
	}
}
