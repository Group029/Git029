package assignmentno12;

public class UserNotFoundException extends Exception  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserNotFoundException(String erroMsg) {
		super(erroMsg);
	}
	
	public String getMessage() {
		String finalMessage = super.getMessage();
		return finalMessage;
	}
	
}
