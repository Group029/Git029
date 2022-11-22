package assignmentno8;

public class AlphabetsAndAscii implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char i='A';i<='Z';i++) {
			Thread currThread = Thread.currentThread();
			String name = currThread.getName();
			if(name.equals("alphabets")) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println((int)i);
				 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
