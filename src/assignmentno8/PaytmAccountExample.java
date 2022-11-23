package assignmentno8;

public class PaytmAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaytmAccount a1 = new PaytmAccount("844268483","Aniket",3500);
		Runnable r1=new PaytmAccountThread(a1);
		Runnable r2=new PaytmAccountThread(a1);
		
		Thread t1 =new Thread(r1,"deposite");
		Thread t2 =new Thread(r2,"withdraw");
		
		t1.start();
		t2.start();
	}

}
