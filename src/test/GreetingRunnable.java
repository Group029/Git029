package test;

public class GreetingRunnable implements Runnable {
	private String greetingMessage;
	private int delayTime; 
	
	public GreetingRunnable(String greetingMessage, int delayTime) {
		super();
		this.greetingMessage = greetingMessage;
		this.delayTime = delayTime;
	}
	
	

	@Override
	public void run() {
			for(int i=0;i<10;i++) {
				System.out.println(greetingMessage);
				try {
					Thread.sleep(delayTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		

	}

}
