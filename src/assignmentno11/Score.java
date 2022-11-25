package assignmentno11;

import java.util.Objects;

public class Score {
	private int run;
	private boolean notOut;
	
	public Score() {
		super();
		run = 165;
		notOut=false;
	}
	
	public Score(int run, boolean notOut) {
		super();
		this.run = run;
		this.notOut = notOut;
	}

	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public boolean isNotOut() {
		return notOut;
	}
	public void setNotOut(boolean notOut) {
		this.notOut = notOut;
	}

	@Override
	public int hashCode() {
		return Objects.hash(notOut, run);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return notOut == other.notOut && run == other.run;
	}
	
	
}
