
public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(101,"aniket",10000000);
		Account a2 = new Account(102,"vaibhav",5000000);
		Account a3 = new Account(103,"Dominic",8000000);
		Account a4 = new Account(104,"vijay",80000);
		Account a5 = new Account(104,"umesh",80000);
		Account a6 = new Account(104,"Harsal",80000);
		
		 Account accountArray[]= {a1,a2,a3,a4,a5,a6}; 
		 
		a1.withdraw(25000);
		System.out.println("current bal a1: "+a1.getBalance());
		a1.deposit(25000);
		System.out.println("current bal a1: "+a1.getBalance());
		a1.transferFunds(a2, 25000);
		System.out.println("current bal a1: "+a1.getBalance());
		System.out.println("current bal a2: "+a2.getBalance());
		
		a1.transferFunds(a3, 15000);
		System.out.println("current bal of a1: "+a1.getBalance());
		System.out.println("current bal of a3: "+a3.getBalance());
		a1.deposit(500000);
		System.out.println("Adding money to a1: "+a1.getBalance());
		a4.transferFunds(a1, 50000);
		System.out.println(a1.getBalance());
		
		String aboveAverage[] = AccountProcessor.getBalanceAboveAverage(accountArray);
		for(String name : aboveAverage) {
			if(name != null) {
				System.out.println(name);
			}
		}
		
	}

}
