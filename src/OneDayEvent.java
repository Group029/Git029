
public class OneDayEvent extends Event {

	private int hours;
	private int ratePerHour;
	private int extraHours;
	private int ratePerExtraHour;

	public OneDayEvent() {
		
	}

	public OneDayEvent(int eventId, String eventName, float baseFare, int hours, int ratePerHour, int extraHours,
	int ratePerExtraHour) {
		super(eventId, eventName, baseFare);
		this.hours = hours;
		this.ratePerHour = ratePerHour;
		this.extraHours = extraHours;
		this.ratePerExtraHour = ratePerExtraHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public int getExtraHours() {
		return extraHours;
	}
	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}
	public int getRatePerExtraHour() {
		return ratePerExtraHour;
	}

	public void setRatePerExtraHour(int ratePerExtraHour) {
		this.ratePerExtraHour = ratePerExtraHour;
	}

	@Override
	public float getTotalFare() {

		float totalBill=(extraHours*ratePerExtraHour)+(hours*ratePerHour)+getBaseFare();
	return totalBill;

	}
}
