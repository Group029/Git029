package assignmentno8new;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source =args[0];
		String distnation=args[1];
		
		StringBuilder sc = new StringBuilder();
		
		try(FileInputStream fin = new FileInputStream(source);
				BufferedInputStream bin = new BufferedInputStream(fin);
				FileOutputStream fo = new FileOutputStream(distnation,true);
				BufferedOutputStream bo = new BufferedOutputStream(fo)){
				while(true) {
					int data = bin.read();
					if(data == -1) {
						break;
					}
					else
						sc.append((char)data);
				}
				String str =sc.toString();
				byte [] str1 = str.getBytes();
				fo.write(str1);
				System.out.println("Data copied Successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
