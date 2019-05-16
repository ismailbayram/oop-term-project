
public class ParkRecord {
	private Time enterTime, exitTime;
	private Vehicle vehicle;
	
	public ParkRecord(Time enter, Time exit, Vehicle vehicle) {
		this.enterTime = enter;
		this.exitTime = exit;
		this.vehicle = vehicle;
	}
	public ParkRecord(Time enter, Vehicle vehicle) {
		this.vehicle = vehicle;
		this.enterTime = enter;
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
	@Override
	public String toString() {
		return "ParkRecord [enterTime=" + enterTime + ", exitTime=" + exitTime + ", vehicle=" + vehicle + "]";
	}
	
}
