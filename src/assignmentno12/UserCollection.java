package assignmentno12;

import java.util.HashMap;
import java.util.Map;


public class UserCollection {
	static Map<User, UserDetails> userData = new HashMap<User, UserDetails>();
	

	public static Map<User, UserDetails> getUserData() {
		return userData;
	}

	public static void setUserData(Map<User, UserDetails> userData) {
		UserCollection.userData = userData;
	}
	 
	 public void getuserDetails(User key) throws UserNotFoundException {

		 boolean b =userData.containsKey(key);
			 if(b) {
				 UserDetails use = userData.get(key);
				 System.out.println(use.toString());
			 }
			 else {
				 UserNotFoundException e = new UserNotFoundException("User Not Found");
				 throw e;
			 }
	 }
}
