package ch08_ClassesAndObjects;

public class Invoice {
	
	private String partNumber=""; 
	private String partDesc;
	private int quantity;
	private double price; // per part item
	
	// nese nuk krijoni konstrukstorin, krijohet nje default
	// public Invoice() {}

	public Invoice(String partNumber, String partDesc,int quantity, 
			double price) {
		if (partNumber != null && partNumber.length() > 0) // !partNumber.equals("")
			this.partNumber = partNumber;
		this.partDesc = partDesc;
		if (quantity > 0)
			this.quantity = quantity;
		if (price > 0)
			this.price = price;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		if (partNumber != null && partNumber.length() > 0) // !partNumber.equals("")
			this.partNumber = partNumber;
	}
	
	public String getPartDesc() {
		return partDesc;
	}
	
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		if (quantity > 0)
			this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}
	
	public double getInvoiceAmount() {
		return price * quantity;
	}
	
	
}
