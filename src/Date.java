import java.util.Calendar;

public class Date {
	private int day, month, year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		if( !this.isValid() ) {
			Calendar today = Calendar.getInstance();
			this.day = today.get(Calendar.DAY_OF_MONTH);
			this.month = today.get(Calendar.MONTH) + 1;
			this.year = today.get(Calendar.YEAR);
		}
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
		if (this.year > other.year)
			return true;
		if (this.year == other.year && this.month > other.month)
			return true;
		if (this.year == other.year && this.month == other.month && this.day > other.day)
			return true;
		return false;
	}
	
	public boolean isBeforeThan(Date other) {
		if (this.year < other.year)
			return true;
		if (this.year == other.year && this.month < other.month)
			return true;
		if (this.year == other.year && this.month == other.month && this.day < other.day)
			return true;
		return false;
	}
	
	public boolean isEqualsWith(Date other) {
		return this.year == other.year && this.month == other.month && this.day == other.day;
	}
	
	public boolean isValid() {
		int max = 30;
		if (this.month == 2 && this.year % 4 == 0) {
			max = 30;
			if (this.year % 100 == 0 && this.year % 400 != 0)
				max = 28;
		}
		if ((this.month <= 7 && this.month % 2 ==1) || (this.month >= 8 && this.month % 2 == 0))
			max = 31;
		if (this.day >= 1 && this.day <= max && this.month >= 1 && this.month <= 12)
			return true;
		return false;
	}
	
	public static Date getToday() {
		Calendar today = Calendar.getInstance();
		Date d = new Date(today.get(Calendar.DAY_OF_MONTH), today.get(Calendar.MONTH) + 1, today.get(Calendar.YEAR));
		return d;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
