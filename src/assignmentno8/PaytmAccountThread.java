package assignmentno8;

public class PaytmAccountThread extends Exception implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PaytmAccount account;

	public PaytmAccountThread(PaytmAccount account) {
		super();
		this.account = account;
	}
	
	public void run() {
		synchronized (account) {
		if(Thread.currentThread().getName().equals("deposite")) {
			try {
				account.addMoney(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				account.makePayment(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}
	}
	
}
