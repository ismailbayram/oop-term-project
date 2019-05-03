
public class Time {
	private int hour, minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getDifference(Time other) {
		int totalMin = 0;
		int selfHour = this.getHour();
		if (this.getMinute() < other.getMinute()) {
			selfHour--;
			totalMin = this.getMinute() + 60 - other.getMinute();
		} else {
			totalMin = this.getMinute() - other.getMinute();
		}
		totalMin = totalMin + ((selfHour - other.getHour()) * 60);
		return totalMin;
	}
}
