package ch12_Enums;

enum Compass{ 
	NORTH(0),SOUTH(180),EAST(90),WEST(270);
	
	public final int grade;
	
	private Compass(int grade) {
		this.grade = grade;
	}
	public static void printValues() {
		for (Compass c : values())
			System.out.println(c + " "+c.grade);
	}
} 

public class EnumExample2 {
	
	private Compass currentBearing;
	
	public EnumExample2(Compass currentBearing) {
		this.currentBearing = currentBearing;
		System.out.println(currentBearing);
	}
	
	public void printWhichDirection() {
		System.out.println(currentBearing.grade + " grade");
	}
	
	
	
}
