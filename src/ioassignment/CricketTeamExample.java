package ioassignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class CricketTeamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath ="./src/ioassignment/CricketTeam.txt";
		CricketTeam team[]= new CricketTeam[3];
			
		try(FileOutputStream fout = new FileOutputStream(filePath);
		ObjectOutputStream out = new ObjectOutputStream(fout);
				Scanner sc = new Scanner(System.in)) {
			
			for(int i=0;i<3;i++) {
				System.out.println("Enter Team Name :- ");
				String name = sc.nextLine();
				
				System.out.println("Match Played :- ");
				int matchPlayed=sc.nextInt();
				
				System.out.println("Match Won :- ");
				int matchWon = sc.nextInt();
				
				sc.nextLine();
				
				team[i] = new CricketTeam(name, matchPlayed, matchWon);
				
				out.writeObject(team[i]);
				System.out.println("Object saved");
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
