package test;

public class RunnableExample {
	public static void main(String[] args) {
		
		Runnable r1= new GreetingRunnable("hello", 2000);
		Runnable r2= new GreetingRunnable("hi", 2001);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
