package assignmentno5;

public class TypeShirtAvailable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shirt s1[] = new Shirt[6];
		s1[0]=new Shirt("Armani", "Grey", "Tshirt", 799);
		s1[1]=new Shirt("Nike", "Blue", "Hoodie", 1299);
		s1[2]=new Shirt("Overlays", "Orange", "TShirt", 2559);
		s1[3] =new Shirt("Puma", "Black", "Hoodie", 5000);
		s1[4]=new Shirt("New Balance", "Purple", "Checks", 7000);
		s1[5]=new Shirt("Sketchers", "White", "Checks", 10000);
		
		ShirtCollection.setShirts(s1);
		 int price=Integer.parseInt(args[3]);
		 Shirt shirt= new Shirt(args[0],args[1],args[2],price);
		 boolean isAvailable=ShirtCollection.isShirtAvailable(shirt);
		 if (isAvailable) {
			 System.out.println("Sht is Available " +shirt.toString());
		 }
		 else
			 System.out.println("Shirt is not Available "+shirt.toString());
	}

}
