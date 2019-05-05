
public class Main {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		Date d1 = new Date(13,2, 2019);
		Date d2 = new Date(13,6, 2019);
		AutoPark autoPark = new AutoPark(2.0, 100);
		Subscription sub = new Subscription(d1, d2, "34FH3773");
		System.out.println(autoPark.searchVehicle("34FH3773"));
		SubscribedVehicle vehicle = sub.getVehicle();
		autoPark.addVehicle(vehicle);
		System.out.println(sub.getVehicle().getSubscription().isValid());
		System.out.println(autoPark.searchVehicle("34FH3773"));
	}
}
