package assignmentno11;

import java.util.ArrayList;
import java.util.List;

public class BatsMan {
	String name;
	List<Score> scores;

	public BatsMan() {
		super();
		name = "mahi";
		scores = new ArrayList<Score>();
	}
	public BatsMan(String name, List<Score> scores) {
		super();
		this.name = name;
		this.scores = scores;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	public void addScore(Score score) {
		scores.add(score);
	}
	public float getBattingAverage() throws ScoreException {
		int r = 0 ;
		float avg=0;
		int count=0;
		float sum =0;
		for(Score score : scores) {
		 r =score.getRun();	
		 sum = sum + r;
		 if(score.isNotOut()==false) {
			 count++;
		 }
		}
		 if(count!=0) {
			avg = sum/count; 
		 }
		 else {
			ScoreException e = new ScoreException("Infinty", name);
			throw e;
		 }
		return avg;
	}
}
