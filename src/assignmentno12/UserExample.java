package assignmentno12;

import java.util.Scanner;

public class UserExample {
	 static {
		User u1 = new User("Aniket","VikramC@ha");
		User u2 = new User("Jonty","Jonty@is Doggy");
		User u3 = new User("Vikram","MeBig@C");
		
		UserDetails d1 = new UserDetails("Aniket", "Kondheaker", 23);
		UserDetails d2 = new UserDetails("Shriyog", "Vichara", 22);
		UserDetails d3 = new UserDetails("Vikram", "Rathod", 23);
		
		UserCollection.userData.put(u3, d3);
		UserCollection.userData.put(u2, d2);
		UserCollection.userData.put(u1,d1);
	}

	public static void main(String[] args) {
		String uName= "Aniket"; 
		String passWord="VikramC@ha";
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter UserName :- ");
			uName = sc.nextLine();
			System.out.print("Enter Password :- ");
			passWord = sc.nextLine();
		}
		User use = new User(uName, passWord);
		
		UserCollection u1 = new UserCollection();
		
		try {
			u1.getuserDetails(use);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
