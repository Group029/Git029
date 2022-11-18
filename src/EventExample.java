
public class EventExample {
	public static void main(String[] args) {

		OverNightEvent on1 = new OverNightEvent(0212,"Wedding",10000,4,5000,5,3000);
		OneDayEvent od1= new OneDayEvent(1999,"Birthday",10000,4,2000,2,500);

		float nightEventBill= on1.getTotalFare();
		System.out.println("Over Night Event total Bill : "+nightEventBill);

		float oneDayEventBill = od1.getTotalFare();
		System.out.println("One Day Event Total Bill : "+oneDayEventBill);
	}
}
