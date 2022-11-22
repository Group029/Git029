package assignmentno7;

public class InvalidEmailAddressException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String invalidEmail ;

	public InvalidEmailAddressException(String errorMessage, String invaildEmail) {
		super(errorMessage);
		this.invalidEmail = invaildEmail;
	}
	
	public String getMessage() {
		String errMessage = super.getMessage();
		String finalMessage = errMessage + ": " + invalidEmail;
		return finalMessage;
	}

}
