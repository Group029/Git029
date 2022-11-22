package assigmentno8;

import assignmentno8.AlphabetsAndAscii;

public class AlphabetsAndAsciiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 =new AlphabetsAndAscii();
		Runnable r2 =new AlphabetsAndAscii();
		
		Thread t1 = new Thread(r1,"alphabets");
		Thread t2 = new Thread(r2,"Harshal");
		t1.start();
		t2.start();
	}

}
