package test;

public class MessageThread extends Thread {
	private Message messageObject;
	
	public MessageThread(Message messageObject) {
		this.messageObject = messageObject;
	}

	public void run() {
		synchronized (messageObject) {
			try {
				messageObject.printMessage();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
