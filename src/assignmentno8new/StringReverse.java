package assignmentno8new;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StringReverse {
	
	public static void main(String[] args) {
		String fileName = args[0];
		String filePath= "./src/assignmentno8new/"+ fileName;
		 
		StringBuilder sc = new StringBuilder();
		
		try(FileInputStream fin = new FileInputStream(filePath);
				BufferedInputStream bin = new BufferedInputStream(fin)){
			while(true) {
				int data = bin.read();
			if(data != -1)
				sc.append((char)data);
			else
				break;
			}
			
			sc.reverse();
			System.out.println(sc);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
