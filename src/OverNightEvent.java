
public class OverNightEvent extends Event {

	private int days;
	private int ratePerDay;
	private int roomCount;
	private int farePerRoom;

	public OverNightEvent() {

	}

	public OverNightEvent(int eventId, String eventName, float baseFare, int days, int ratePerDay, int roomCount,
			int farePerRoom) {
		super(eventId, eventName, baseFare);
		this.days = days;
		this.ratePerDay = ratePerDay;
		this.roomCount = roomCount;
		this.farePerRoom = farePerRoom;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(int ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getFarePerRoom() {
		return farePerRoom;
	}

	public void setFarePerRoom(int farePerRoom) {
		this.farePerRoom = farePerRoom;
	}
	
	
	@Override
	public float getTotalFare() {
		float totalBill=getBaseFare()+( days*ratePerDay)+(roomCount*farePerRoom*(days-1));
		return totalBill;
	}
}
