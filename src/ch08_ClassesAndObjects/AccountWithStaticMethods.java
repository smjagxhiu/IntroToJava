package ch08_ClassesAndObjects;

public class AccountWithStaticMethods {
	
	//vlera default per cfaredo objekti eshte null
	//vlera default per char,byte,int,long eshte 0
	//vlera default per double eshte 0.0
	//vlera default per boolean eshte false;
	private String name;
	private double balance;
	
	private static double UD = 1.15;
	private static double BTC =  .00029;
	
	public AccountWithStaticMethods(String name, double balance) {
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
	
	public void print() {
		System.out.printf("Account %s has balnce of %.2f %n", 
				name, balance);
	}
	
	public static void printExchangeRate(double euro) {
		System.out.printf("1 euro= %.3f$ = %.7fBTC %n",UD, BTC);
		System.out.printf("%.2f euro =  %.3f$ = %.7fBTC %n",euro, UD *euro, 
				BTC * euro);
	}
	
	// per exchange rate te balancit funksioni duhet te jete jo statik
	
	public static void main(String[] args) {
		AccountWithStaticMethods a1 = new AccountWithStaticMethods("A1", 100);
		AccountWithStaticMethods a2 = new AccountWithStaticMethods("A2", 0);
		a1.print();
		a2.print();
		AccountWithStaticMethods.printExchangeRate(a1.getBalance());
	}
	
	

}
