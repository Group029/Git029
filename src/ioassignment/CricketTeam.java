package ioassignment;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CricketTeam implements Serializable {
	private String teamName;
	private int matchesPlayed;
	private int mactchWon;
	
	
	public CricketTeam() {
		super();
		teamName="a";
		matchesPlayed=5;
		mactchWon=10;
	}
	
	public CricketTeam(String name, int matchesPlayed, int mactchWon) {
		super();
		this.teamName = name;
		this.matchesPlayed = matchesPlayed;
		this.mactchWon = mactchWon;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getMactchWon() {
		return mactchWon;
	}

	public void setMactchWon(int mactchWon) {
		this.mactchWon = mactchWon;
	}

	@Override
	public String toString() {
		return "CricketTeam [Team name=" + teamName + ", matchesPlayed=" + matchesPlayed + ", mactchWon=" + mactchWon + "]";
	}
}
