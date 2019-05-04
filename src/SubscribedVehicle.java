
public class SubscribedVehicle implements Vehicle {
	private String plate;
	private Subscription subscription;
	
	public SubscribedVehicle(String plate) {
		this.plate = plate;
	}
	
	public String getPlate() {
		return this.plate;
	}
	public boolean isSpecial() {
		return false;
	}
}
