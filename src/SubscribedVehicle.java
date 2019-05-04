
public class SubscribedVehicle implements Vehicle {
	private String plate;
	private Subscription subscription;
	
	public SubscribedVehicle(String plate) {
		this.plate = plate;
	}
	
	public String getPlate() {
		return this.plate;
	}
	
	public void setPlate(String plate) {
		this.plate = plate;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	public Subscription getSubscription() {
		return this.subscription;
	}
	
	public boolean isSpecial() {
		return false;
	}
}
