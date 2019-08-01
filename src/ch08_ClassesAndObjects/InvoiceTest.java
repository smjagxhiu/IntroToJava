package ch08_ClassesAndObjects;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i1 = new Invoice("HDD","hard disc",2,80);
		Invoice i2 = new Invoice("SSD","solid state drive",3,100);
		Invoice i3 = new Invoice("RAM","random access memory",5,75);
		i3.setQuantity(10);
		System.out.printf("The amount for invoice %s is %.2f %n", 
				i1.getPartNumber(), i1.getInvoiceAmount());
		System.out.printf("The amount for invoice %s is %.2f %n", 
				i2.getPartNumber(), i2.getInvoiceAmount());
		System.out.printf("The amount for invoice %s is %.2f %n", 
				i3.getPartNumber(), i3.getInvoiceAmount());
	}

}
