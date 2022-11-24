package assignmentno10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WorkingHours {

	public static void main(String[] args) {
		
		String filePath = "./src/assignmentno10/WorkDuration.txt";
		int TotalWorkDurationInHour = 0;
		int TotalWorkDurationInMin = 0;
		int min=0;
		int hour=0;
		File currentFile = new File(filePath);
		boolean isAvailable = currentFile.exists();
		if(isAvailable) {
			try(FileReader fr = new FileReader(currentFile);
					BufferedReader br =new BufferedReader(fr)){
				while(true) {
					String workerInfo = br.readLine();
					if(workerInfo == null)
						break;
					String[] workerData = workerInfo.split(":");
					int workDurationInHour = Integer.parseInt(workerData[0]);					
					TotalWorkDurationInHour += workDurationInHour;
					int workDurationInMin = Integer.parseInt(workerData[1]);
					TotalWorkDurationInMin += workDurationInMin;
				}
				hour=(TotalWorkDurationInMin/60);
				min=(TotalWorkDurationInMin%60);
				
				TotalWorkDurationInHour= TotalWorkDurationInHour +hour;
				TotalWorkDurationInMin=min;
				System.out.println("Total work Duration "+TotalWorkDurationInHour+":"+TotalWorkDurationInMin);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
