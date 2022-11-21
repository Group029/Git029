package assignmentno7;

public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2430690984042805572L;
	private int invalidAge ;
	
	public InvalidAgeException(String errorMessage, int invalidAge) {
		super(errorMessage);
		this.invalidAge=invalidAge;
	}
	public String getMessage() {
		String errMessage = super.getMessage();
		String finalMessage = errMessage + ": " + invalidAge;
		return finalMessage;
	}		
}
