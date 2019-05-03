
public class ParkRecord {
	private Time enterTime, exitTime;
	private Vehicle vehicle;
	
	public ParkRecord(Time enter, Time exit) {
		this.enterTime = enter;
		this.exitTime = exit;
	}

	public Time getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Time enterTime) {
		this.enterTime = enterTime;
	}

	public Time getExitTime() {
		return exitTime;
	}

	public void setExitTime(Time exitTime) {
		this.exitTime = exitTime;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public int getParkingDuration() {
		return this.exitTime.getDifference(this.enterTime);
	}
}
