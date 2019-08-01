package ch09_loops;

public class Div2 {
	
	public static int count(int n) {
		int counter = 0;
		if (n > 1) 
			while (n != 1) {
				n = n/2;
				counter++;
			}		
		return counter;
	}
	
	public static String convertToBinary(int n) {
		if (n >= 0) {
			String res = "";
			while (n != 0 ) {
				res =  (n % 2) + res ;
				n = n / 2;
			}
			return res;
		}
		return null;
	}
	
	public static int convertToDecimal(String binary) {
		int sum = 0;
		for (int i = binary.length() - 1,pow = 0; i >= 0; i--, pow++) 
			sum += Math.pow(2, pow) * Integer.parseInt(binary.charAt(i)+"");
		return sum;
	}

	public static void main(String[] args) {
		int n = 1024;
		System.out.printf("Numri %d pjestohet me 2, %d here %n", n, count(n));
		n = 55;
		String b = convertToBinary(n);
		System.out.printf("(%d)10 = (%s)2 %n", n, b);
		int n2 = convertToDecimal(b);
		System.out.printf("(%s)2 = (%d)10 %n", b, n2);
	}

}
