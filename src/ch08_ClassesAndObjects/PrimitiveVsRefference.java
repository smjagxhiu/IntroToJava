package ch08_ClassesAndObjects;

public class PrimitiveVsRefference {

	public static void main(String[] args) {
		// primitive vs reference
		// primitive: int, byte, short, char, double, float, boolean, long
		// a dhe b jane variabla lokale brenda funksionit main()
		int a = 12;
		byte b;
		//int c = a + b; // variablat lokale nuk munedn te perdoren pa u inicializu
		
		//reference: String, Scanner, GregorianCalendar
		java.util.Scanner in = new java.util.Scanner(System.in);
		int num = in.nextInt();

		String s1 = "aaaa";
		String s2 = new String("bbbb");
		System.out.println(s1.equals(s2));
		
		java.util.GregorianCalendar calendar;
		
		//System.out.println(calendar.getTime());
		
		calendar = new java.util.GregorianCalendar();
		System.out.println(calendar.getTime());
	}

}
