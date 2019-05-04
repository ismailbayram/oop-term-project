
public class Subscription {
	private Date begin;
	private Date end;
	private SubscribedVehicle vehicle;

	public Subscription(Date begin, Date end, String plate) {
		this.begin = begin;
		this.end = end;
		this.vehicle = new SubscribedVehicle(plate);
	}

	public boolean isValid() {
		if (this.vehicle.isSpecial())
			return true;
		return this.begin.isEqualsWith(Date.getToday()) && this.begin.isBeforeThan(Date.getToday())
				&& this.end.isEqualsWith(Date.getToday()) && this.end.isAfterThan(Date.getToday());

	}
}
