package ch10_Arrays;

public class ProgramArguments1 {

	// right click the code editor -> Run as -> Run Configuration
	// Arguments Tab, under the program arguments write two strings (that re numbers) seperated with spaces
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		//Bitwise operators
		System.out.printf("%d & %d = %d %n", n1,n2, n1&n2);
		System.out.printf("%d | %d = %d %n", n1,n2, n1|n2);
		System.out.printf("%d ^ %d = %d %n", n1,n2, n1^n2);
		System.out.printf("%d >> %d = %d %n", n1,2, n1>>2);
		System.out.printf("%d << %d = %d %n", n1,2, n1<<2);
	}

}
