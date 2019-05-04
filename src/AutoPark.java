public class AutoPark {
	private SubscribedVehicle[] subscribedVehicles;
	private ParkRecord[] parkRecords;
	private double hourlyFee, incomeDaily;
	
	public AutoPark(double hourlyFee, double incomeDaily) {
		this.hourlyFee = hourlyFee;
		this.incomeDaily = incomeDaily;
	}

	public double getHourlyFee() {
		return hourlyFee;
	}

	public void setHourlyFee(double hourlyFee) {
		this.hourlyFee = hourlyFee;
	}

	public double getIncomeDaily() {
		return incomeDaily;
	}

	public void setIncomeDaily(double incomeDaily) {
		this.incomeDaily = incomeDaily;
	}
}
