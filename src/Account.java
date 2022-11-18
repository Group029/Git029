
public class Account {


	private int accountNo;
	private String name;
	private float balance;
	
	public Account() {
		accountNo = 00;
		name = "A";
		balance = 0.00f;
	}
	//Assign & accept values
	public Account(int accountNo, String name, float balance) {
	
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void deposit(float deposite) {
		balance += deposite;
	}
	public void withdraw(float withdraw) {
		balance -= withdraw;
	}	
	public void transferFunds (Account toAccount, float amountToTransfer) {
	this.withdraw(amountToTransfer);
	toAccount.deposit(amountToTransfer);
	}

}
