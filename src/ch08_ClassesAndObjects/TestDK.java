package ch08_ClassesAndObjects;

public class TestDK {

	public static void main(String[] args) {
		
		Drejtekendeshi d1 = new Drejtekendeshi(10,15);
		double p = d1.perimetri();
		double s = d1.syprina();
		String g = d1.gjeresiaDheGjatesia();
		System.out.printf(
				"Drejtkenedhi %s ka perimetrin %.2f dhe syprinen %.2f %n", 
						g,p,s);
		
		Drejtekendeshi d2 = new Drejtekendeshi(12.5,15.6);
		//...
	}

}
