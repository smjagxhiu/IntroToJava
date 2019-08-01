package ch08_ClassesAndObjects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DOB {
	
	private int day, month, year;
	private GregorianCalendar cal;
	
	public DOB(int day, int month, int year) {
		cal = new GregorianCalendar();
		if (year >= 1918 && year <= 2018)
			this.year = year;
		else this.year = cal.get(Calendar.YEAR);
		if (month >= 0 && month < 11)
			this.month = month;
		else this.month = cal.get(Calendar.MONTH);	
		validateDay(day);
		
	} // end of constructor
	
	private void validateDay(int day) {
		boolean flag = false;
		if (day > 0) {
			boolean valid = (month == 0 || month == 2 || month == 4 || 
					month == 6 || month == 7 || month == 9 || month == 11) 
						&& day <= 31; 
			if ( valid )flag = true;
			else if ( (month == 3 || month == 5 || month == 8 || month == 10  ) 
					&& day <= 30) flag = true;
			else if ( month == 1 &&  day <= 29  && year % 4 == 0 ) flag = true;
			else if (month == 1 &&  day <= 28  ) flag = true;
			else flag = false;		
			if (flag)
				this.day = day;
			else this.day = cal.get(Calendar.DAY_OF_MONTH);
		}// end of 	if (day > 0)	
	}
	
	public void setDay(int day) {
		cal = new GregorianCalendar();
		validateDay(day);
	}
	
	public void display() {
		System.out.printf("Date is %02d/%02d/%d %n",day, month+1,year);
	}
	
	public int calculateAge() {
		cal = new GregorianCalendar();
		int currentMonth = cal.get(Calendar.MONTH);
		int currentYear =  cal.get(Calendar.YEAR);
		int age = currentYear - year;
		if (month > currentMonth) age--;
		//. calculate days too
		return age;
	}
	
	public String season() {
		// Pranvera fillon nga 15 mars deri 31 maj
		if (month >= 2 && month <= 4) {
			if (day < 15 && month == 2)
				return "Dimri";
			return "Pranvera";
		}
		else if (month >= 5 && month <= 7)
			return "Vera";
		else if (month >= 8 && month <= 10)
			return "Vjeshta";
		else return "Dimri";
	}
	
	public int getDay() {
		return day;
	}
	
	
	
	

}
