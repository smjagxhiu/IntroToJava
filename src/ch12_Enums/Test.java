package ch12_Enums;

public class Test {

	public static void main(String[] args) {
		
		
		EnumExample1 e1 = new EnumExample1(EnumExample1.Season.SUMMER); 
		e1.printSeassons();
		e1.printDateInterval();
		// lexim nga konsola
//		Scanner in = new Scanner (System.in);
//		System.out.print("Type the season: ");
//		String s =in.nextLine().toUpperCase();
//		System.out.println();
//		EnumExample1 e2 = new EnumExample1(EnumExample1.Season.valueOf(s)); 
	
		Compass.printValues();
		EnumExample2 e3 = new EnumExample2(Compass.NORTH);
		e3.printWhichDirection();
		
		
	}

}
