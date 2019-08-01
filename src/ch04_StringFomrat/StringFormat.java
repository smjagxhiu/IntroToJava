package ch04_StringFomrat;

public class StringFormat {
	public static void main(String[] args) {
		System.out.printf("this float,%.5f has precisity of 5 digits%n", 4.5675436);
		System.out.printf("this float,%10.5f has precisity of 5 digits%n", 4.5675436);
		System.out.printf("this float,%-10.5f has precisity of 5 digits%n", 4.5675436);
		System.out.printf("this float,%010.5f has precisity of 5 digits%n", 4.5675436);
		System.out.printf("Ora %02d:%02d %s", 2, 7, "am");
	}

}