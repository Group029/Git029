
public class Event {
	private int  eventId;
	private String eventName;
	private float baseFare;
	
	public Event() {
		baseFare = 10000;
		eventId = 02;
		eventName = "Party";
	}
	
	public Event(int eventId, String eventName, float baseFare) {

		this.eventId = eventId;
		this.eventName = eventName;
		this.baseFare = baseFare;
	}
	
	public int getEventId() {
		return eventId;
	}
	
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public String getEventName() {
		return eventName;
	}
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public float getBaseFare() {
		return baseFare;
	}
	
	public void setBaseFare(float baseFare) {
		this.baseFare = baseFare;
	}

	
	public float getTotalFare() {
		return getBaseFare();
	}
	public void getDetails() {
		
	}
}
