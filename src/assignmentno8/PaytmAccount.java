package assignmentno8;

public class PaytmAccount {
	private String mobileNO;
	private String name;
	private int balance;
	
	public PaytmAccount() {
		super();
		mobileNO = "9860617426";
		name = "harshal";
		balance = 150;
	}

	public PaytmAccount(String mobileNO, String name, int balance) {
		super();
		this.mobileNO = mobileNO;
		this.name = name;
		this.balance = balance;
	}

	public String getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(String mobileNO) {
		this.mobileNO = mobileNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	
	public int addMoney(int deposit) throws InterruptedException {
		System.out.println("Current balance in Account : "+balance);
		Thread.sleep(2000);
		balance += deposit;
		System.out.println("Adding Money "+deposit);
		Thread.sleep(2000);
		System.out.println("Balance after Adding "+deposit+" : "+balance);
		Thread.sleep(2000);
		System.out.println(" ");
		return balance;
	}
	
	public int makePayment(int withdraw) throws InterruptedException {
		System.out.println("Current balance in Account : "+balance);
		Thread.sleep(2000);
		balance -= withdraw;
		System.out.println("Withdraw Money "+withdraw);
		Thread.sleep(2000);
		System.out.println("Balance after withdraw of "+withdraw+" : "+balance);
		return balance;
	}
	
}
