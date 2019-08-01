package ch08_ClassesAndObjects;

public class Account {
	
	//vlera default per cfaredo objekti eshte null
	//vlera default per char,byte,int,long eshte 0
	//vlera default per double eshte 0.0
	//vlera default per boolean eshte false;
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		if (balance > 0)
			this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
		//System.out.println(balance); nuk ekzekutohet kurre
	}
	
	public void setName(String name) {
		this.name = name;
		//this.name eshte atributi
		//name eshte variabla lokale
	}
	
	public String getName() {
		//System.out.println(name);
		return name;
	}
	
	public boolean withdraw(int amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public boolean deposit(int amount) {
		boolean success;
		if (amount > 0) {
			balance += amount;
			success = true;
		}
		else { 
			System.out.printf("Amount %d is not valid.%n",amount);
			success = false;
		}
		return success;		
	}
	
	
	

}
