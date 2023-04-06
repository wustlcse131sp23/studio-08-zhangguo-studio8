package studio8;

import java.util.Objects;

public class Time {
private int hour;
private int minute;
private boolean isTwelveHourFormat;

public Time (int hour, int minute, boolean isTwelveHourFormat) {
	this.hour=hour;
	this.minute=minute;
	this.isTwelveHourFormat=isTwelveHourFormat;
}
	
public String toString() {
	if (isTwelveHourFormat) {
		return this.hour % 12 + ":" +this.minute;
	}
	else {
		return this.hour+ ":" + this.minute;
	}
}
	
	
	public static void main(String[] args) {
		Time twelve = new Time(15, 20, true);
		Time twentyFour = new Time(15, 20, false);
    	
		System.out.print(twelve+" ");
		System.out.println(twelve.equals(twelve));
		System.out.print(twentyFour+" ");
		System.out.println(twentyFour.equals(twelve));
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, isTwelveHourFormat, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && isTwelveHourFormat == other.isTwelveHourFormat && minute == other.minute;
	}
	


}