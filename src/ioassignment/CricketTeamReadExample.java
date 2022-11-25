package ioassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CricketTeamReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath ="./src/ioassignment/CricketTeam.txt";
		
		CricketTeam team[]= new CricketTeam[3];
		
		try(FileInputStream fin = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fin)) {
			for(int i=0;i<3;i++) {
			try {
				Object teamIn= in.readObject();
				team[i] = (CricketTeam)teamIn;	
				float m = team[i].getMatchesPlayed();
				float w = team[i].getMactchWon();
				float winPrectange = (w/m)*100;
				if(winPrectange>70) {
					System.out.println("Team with Highest Percentage of winning");
					System.out.println(team[i].toString());
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
