package assignmentno7;


public class Person {
	private String name;
	private String emailAddress ;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, String emailAddress, int age)throws InvalidAgeException, InvalidEmailAddressException {
		super();
		this.name = name;
		//if email is valid, throw invalid email exception otherwise assign the value
		if(emailAddress.contains("@") && emailAddress.contains(".")) {
			this.emailAddress = emailAddress;
		}
		else {
			InvalidEmailAddressException ex = new InvalidEmailAddressException("Invalid Email", emailAddress );
			throw ex;
		}
		//if age is invalid, throw invalid age exception otherwise assign the value
		if(age>18) {
			this.age = age;
		}
		else {
			InvalidAgeException ex = new InvalidAgeException("Invalid Age", age);
			throw ex;
		}

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress)throws InvalidEmailAddressException {
		//if email is valid, throw invalid email exception otherwise assign the value
		if(emailAddress.contains("@") && emailAddress.contains(".")) {
			this.emailAddress = emailAddress;
		}
		else {
			InvalidEmailAddressException ex = new InvalidEmailAddressException("InvalidEmail", emailAddress );
		
			throw ex;
			}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws InvalidAgeException {
		//if age is invalid, throw invalid age exception otherwise assign the value
		if(age>18) {
			this.age = age;
		}
		else {
			InvalidAgeException ex = new InvalidAgeException("Invalid Age", age);
			throw ex;
		}
	}

}
