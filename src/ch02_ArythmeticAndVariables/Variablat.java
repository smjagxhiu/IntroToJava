package ch02_ArythmeticAndVariables;

public class Variablat {
	public static void main(String[] args) {
		int keys; // deklarim i variables
		keys = 88; // incializim
		// int keys = 88;
		int a = 10; // deklarim dhe inicializim
		System.out.println("Pianoja ka " + keys + " taste");
		keys = 91; // ri-inicializim
		System.out.println("Pianoja ka " + keys + " taste");
		keys = keys + a; // ri-incializim duke perdorur vleren paraprake
		System.out.println("Pianoja ka " + keys + " taste");
	}
}