import java.util.ArrayList;

public class AutoPark {
	private ArrayList<SubscribedVehicle> subscribedVehicles;
	private ArrayList<ParkRecord> parkRecords;
	private ArrayList<Vehicle> vehicles;
	
	private double hourlyFee, incomeDaily;
	private int capacity;
	
	public AutoPark(double hourlyFee, int capacity) {
		this.hourlyFee = hourlyFee;
		this.capacity = capacity;
		this.incomeDaily = 0.0;
		this.subscribedVehicles = new ArrayList<>();
		this.vehicles = new ArrayList<>();
		this.parkRecords = new ArrayList<>();
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
	
	public SubscribedVehicle searchVehicle(String plate) {
		for(SubscribedVehicle subscribedVehicle: subscribedVehicles) {
			if(plate.equals(subscribedVehicle.getPlate())) {
				return subscribedVehicle;
			}
		}
		return null;
	}
	public boolean addVehicle(SubscribedVehicle subscribedVehicle) {
		if(subscribedVehicles.size() == capacity) {
			this.enLargeVehicleArray();
			System.out.println("Kapasite arttirildi");
		}
		if(this.searchVehicle(subscribedVehicle.getPlate()) == null) {
			subscribedVehicles.add(subscribedVehicle);
			return true;
		}
		
		return false;
	}
	
	private void enLargeVehicleArray() {
		this.capacity += this.capacity;
	}
	public boolean isParked(String plate) {
		for(Vehicle vehicle: vehicles) {
			if(plate.equals(vehicle.getPlate())) {
				return true;
			}
		}
		return false;
	}
	public boolean vehicleEnters(String plate, Time enter, boolean isOfficial) {
		if(isOfficial)
			return true;
		
		if(this.isParked(plate))
			return false;
		
		if(this.searchVehicle(plate) != null)
			if(this.searchVehicle(plate).getSubscription().isValid()) {
				vehicles.add(this.searchVehicle(plate));
				return true;
			}
		Vehicle vehicle = new RegularVehicle(plate);
		vehicles.add(vehicle);
		ParkRecord parkRecord = new ParkRecord(enter, vehicle);
		parkRecords.add(parkRecord);
		return true;
	}
	public ParkRecord searchParkRecord(Vehicle vehicle) {
		for(ParkRecord parkRecord: parkRecords) {
			if(vehicle.equals(parkRecord.getVehicle()))
				return parkRecord;
		}
		return null;
	}
	public boolean vehicleExits(String plate, Time exit) {
		for(Vehicle vehicle: vehicles) {
			if(plate.equals(vehicle.getPlate())) {
				if(vehicle.getSubscription() == null) {
					ParkRecord parkRecord = this.searchParkRecord(vehicle);
					this.incomeDaily += this.hourlyFee * (parkRecord.getEnterTime().getDifference(exit));
					parkRecords.remove(parkRecord);
				}
				vehicles.remove(vehicle);
			}
		}
		return true;
	}
	
}
