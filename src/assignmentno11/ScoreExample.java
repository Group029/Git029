package assignmentno11;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Score> run1 = new ArrayList<Score>();
		run1.add(new Score(50,true));
		run1.add(new Score(75, false));
		run1.add(new Score(65, true));
		
		BatsMan b1= new BatsMan("Aniket", run1);
		
		List<Score> run2 = new ArrayList<Score>();
		run2.add(new Score(50,true));
		run2.add(new Score(75, true));
		run2.add(new Score(65, true));
		
		BatsMan b2 = new BatsMan("Vaibhav", run2);
		
		float avg;
		try {
			avg = b1.getBattingAverage();
			System.out.println(b1.getName()+" has average : "+avg);
			avg = b2.getBattingAverage();
			System.out.println(b2.getName()+" has average : "+avg);
		} catch (ScoreException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
