package exo1;

public class LeapYear {
	private int year = 0;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String LeapYear() {
		if((year%4==0 && year%100!=0 )|| year%400==0) {
			return "est bissextile";
		}else {
			return "n'est pas bissextile";
		}
	}
}
