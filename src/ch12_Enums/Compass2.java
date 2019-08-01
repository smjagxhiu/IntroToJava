package ch12_Enums;

import java.awt.Color;

public enum Compass2 {
	
	NORTH(0,Color.blue),SOUTH(180,Color.red),EAST(90,
			Color.yellow),WEST(270,Color.orange);
	
	public final int grade;
	public final Color color;
	
	private Compass2(int grade, Color c) {
		this.grade = grade;
		color = c;
	}
	public static void printValues() {
		for (Compass2 c : values())
			System.out.println(c + " "+c.grade);
	}

}
