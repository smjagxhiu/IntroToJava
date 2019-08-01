package ch02_ArythmeticAndVariables;

/** Shkembimi i vlerave mes dy variablave */
public class VariableSwapping {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.printf("x = %d dhe y = %d %n", x, y);
		// Metoda 1 me perdorim te varaibles se trete
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("x = %d dhe y = %d %n", x, y);
		// Metoda 2 pa perdorim te varaibles se trete
		x = 20;
		y = 15;
		System.out.printf("x = %d dhe y = %d %n", x, y);
		x = x + y; // *
		y = x - y; // /
		x = x - y; // /
		System.out.printf("x = %d dhe y = %d %n", x, y);

	}

}