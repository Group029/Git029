package assignmentno11;

public class ScoreException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String BatsMen;

	public ScoreException(String errMsg, String BatsMen) {
		super(errMsg);
		this.BatsMen = BatsMen;
	}
	@Override
	public String getMessage() {
		String finalmsg =BatsMen+" has average : "+super.getMessage() ;
		return finalmsg;
	}
}
