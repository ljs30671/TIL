package test.encapsulation;

public class MyDate {
	private int year;
	private int month;
	private int day;	
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year2){
		//유효성 검사
		if(year2>0 && year2<2022) {
			year=year2;			
		}else {
			System.out.println("invalid year");
		}
	}

	public void setMonth(int month) {
		//유효성 검
		if(month>0 && month<13) {
			this.month = month;
		}else {
			System.out.println("invalid month");
		}
	}

	public void setDay(int day) {
		//유효성 검사
		if(day>0 && day<32) {
			this.day = day;
		}else {
			System.out.println("invalid day");
		}
	}	
	
}
