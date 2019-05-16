
public class OfficialVehicle {
	private String plate;
	
	public OfficialVehicle(String plate) {
		this.plate = plate;
	}
	
	public String getPlate() {
		return this.plate;
	}
	
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	public Subscription getSubscription() {
		return null;
	}
	
	public boolean isSpecial() {
		return true;
	}

	@Override
	public String toString() {
		return "OfficialVehicle [plate=" + plate + "]";
	}
}
