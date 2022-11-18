
public class AccountProcessor {
	
	public static String[] getBalanceAboveAverage(Account array[]) {
		int size = array.length;
		String aboveAverage[]= new String[size];
		float average=0;
		float sum = 0;
		int index=0;
		String accountNames;
		for(Account bal : array) {
		 sum += bal.getBalance();
		}
		average=(sum/size);
		for(Account name : array) {
			float balance= name.getBalance();
			if(balance>average) {
				accountNames = name.getName();
				aboveAverage[index] = accountNames;
				index++;
			}
		}
	 return aboveAverage;	
	}
}
