package ch08_ClassesAndObjects;

public class DOBTest {

	public static void main(String[] args) {
		DOB d1 = new DOB(21,4,1996);
		d1.display();
		System.out.printf("Mosha %d i lindur ne %s %n ",d1.calculateAge(),
				d1.season());
		
	}

}
