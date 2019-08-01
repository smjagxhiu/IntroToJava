package ch12_Enums;

public class EnumExample1 {
	
	public enum Season{WINTER,SUMMER,SPRING,FALL}; // gjithmone static
	
	private Season currentSeason;
	
	public EnumExample1(Season currentSeason) {
		this.currentSeason = currentSeason;
		System.out.println(currentSeason.name() + 
				" " + currentSeason.ordinal());
	}
	
	public void printSeassons() {
		Season[] seasons =  Season.values();
		for (Season s : seasons)
			System.out.println(s);
	}
	
	public void printDateInterval() {
		switch (currentSeason) {
		case WINTER :
			System.out.println("From 20 November till 20 February");
			break;
		case SPRING:
			System.out.println("From 21 February till 30 May");
			break;
		case SUMMER:
			System.out.println("From 01 June till 31 August");
			break;
		case FALL:
			System.out.println("From 01 September till 19 November");
			break;
		}
	}

	
	
	
}
