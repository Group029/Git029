package assignmentno12;

import java.util.Map;

public class UserCollection {
	static Map<User, UserDetails> userData;
	
	 static {
		User u1 = new User("Aniket","VikramC@ha");
		User u2 = new User("Jonty","Jonty@is Doggy");
		User u3 = new User("Vikram","MeBig@C");
		
		UserDetails d1 = new UserDetails("Aniket", "Kondheaker", 23);
		UserDetails d2 = new UserDetails("Shriyog", "Vichara", 22);
		UserDetails d3 = new UserDetails("Vikram", "Rathod", 23);
		
		userData.put(u3, d3);
		userData.put(u2, d2);
		userData.put(u1,d1);
	}
}
