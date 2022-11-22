package assignmentno7;

public class PersonExample {

	public static void main(String[] args){
		@SuppressWarnings("unused")
		Person p1 = new Person();
		try {
			p1=new Person("Aniket","02aniket1999@gmailcom",16);
		}
		catch(InvalidAgeException e ) {
			System.out.println(e.getMessage());
		}
		catch (InvalidEmailAddressException e) {
			System.out.println(e.getMessage());
		}
		try {
			p1=new Person("Aniket","02aniket1999@gmail.com",16);
		}
		catch(InvalidAgeException e ) {
			System.out.println(e.getMessage());
		}
		catch (InvalidEmailAddressException e) {
			System.out.println(e.getMessage());
		}
	}
}
