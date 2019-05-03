import java.util.Calendar;
import java.util.Date;
private Date javaDate;

public class Date {
	private int day, month, year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isAfterThan(Date other) {
		return this.year > other.year && this.month > other.month && this.day > other.day;
	}
	
	public boolean isBeforeThan(Date other) {
		return this.year < other.year && this.month < other.month && this.day < other.day;
	}
	
	public boolean isEqualsWith(Date other) {
		return this.year == other.year && this.month == other.month && this.day == other.day;
	}
	
	@SuppressWarnings("deprecation")
	public static Date getToday() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime().getDay());
		System.out.println(cal.getTime().getMonth());
		System.out.println(cal.getTime().getYear());
		Date d = new Date(cal.getTime().getDay(), cal.getTime().getMonth(), cal.getTime().getYear());
		return d;
	}
}
