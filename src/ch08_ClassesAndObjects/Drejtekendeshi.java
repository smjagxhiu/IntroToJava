package ch08_ClassesAndObjects;

public class Drejtekendeshi {
	
	private double gjatesia, gjeresia, perimetri, syprina;
	
	public Drejtekendeshi(double gjatesia, double gjeresia) {
		this.gjatesia = gjatesia;
		this.gjeresia = gjeresia;
	}
	
	public double merGjatesia() {
		return gjatesia;
	}
	
	public void caktoGjatesia(double gjatesia) {
		this.gjatesia = gjatesia;
	}
	
	public double merGjeresia() {
		return gjeresia;
	}
	
	public void caktoGjeresia(double g) {
		gjeresia = g;
	}
	
	public double perimetri() {
		//return 2  * (gjeresia + gjatesia);
		perimetri = 2 * (gjeresia + gjatesia);
		return perimetri;
	}
	
	public double syprina() {
		syprina = gjeresia * gjatesia;
		return syprina;
	}
	
	public String gjeresiaDheGjatesia() {
		//return "Gjeresia: " + gjeresia + ", gjatesia: " + gjatesia; 
		return String.format(
				"Gjeresia: %.1f, gjatesia: %.1f", gjeresia,gjatesia);
	}
	
	

}
