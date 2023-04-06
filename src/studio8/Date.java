package studio8;

import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date (int month, int day, int year) {
		this.month=month;
		this.day=day;
		this.year=year;
	}

	public String toString() {
		
		return month+ "/" + day + "/" + year;
	}

    public static void main(String[] args) {
    	Date today= new Date (4, 6, 2023);
    	System.out.println(today);

    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
