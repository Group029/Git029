package ioassignment;

public class CricketTeam {
	private String name;
	private int matchesPlayed;
	private int mactchWon;
	
	
	public CricketTeam() {
		super();
		name="a";
		matchesPlayed=5;
		mactchWon=10;
	}
	
	public CricketTeam(String name, int matchesPlayed, int mactchWon) {
		super();
		this.name = name;
		this.matchesPlayed = matchesPlayed;
		this.mactchWon = mactchWon;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMactchWon() {
		return mactchWon;
	}

	public void setMactchWon(int mactchWon) {
		this.mactchWon = mactchWon;
	}

	@Override
	public String toString() {
		return "CricketTeam [name=" + name + ", matchesPlayed=" + matchesPlayed + ", mactchWon=" + mactchWon + "]";
	}
}
