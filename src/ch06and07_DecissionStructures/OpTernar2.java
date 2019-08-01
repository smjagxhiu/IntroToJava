package ch06and07_DecissionStructures;

public class OpTernar2 {

	public static void main(String[] args) {
		
		int i = -13;
		
		/* int k;
		 * if (i > 0)
		 * 	k = i;
		 * else if (i < 10)
		 * 	k = 10;
		 * else k = -i;
		 */
		
		int k = i > 0 ? i : i < 10 ? 10 : -i; 
		System.out.println(k);
		
		
	}

}
