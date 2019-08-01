package ch08_ClassesAndObjects;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Emri i LLogarise: ");
		String name = in.nextLine();
		System.out.print("Bilanci i llogarise: ");
		double balance = in.nextDouble();
//		Account account1 = new Account();
		//System.out.println(account1.name);
//		System.out.printf("The owner of the account is %s.%n",account1.getName());
//		account1.setName(name);
		Account account1 = new Account(name,balance);
		String n =account1.getName();
		System.out.printf("The owner of the account is %s and balance is %.2f.%n%n"
				,n, account1.getBalance());
		System.out.print("Emri i LLogarise 2: ");
		name = in.next();
		System.out.print("Bilanci i llogarise 2: ");
		balance = in.nextDouble();
		Account account2 = new Account(name,balance);
		System.out.printf("The owner of the account is %s and balance is %.2f.%n%n"
				,account2.getName(), account2.getBalance());
		
		account1.deposit(560);
		System.out.printf(
				"Deposit %d to account %s. Balance is %.2f %n",560,
				account1.getName(), account1.getBalance());
		account2.deposit(1245);
		System.out.printf(
				"Deposit %d to account %s. Balance is %.2f %n",1245,
				account2.getName(), account2.getBalance());
		
		boolean success = account1.withdraw(70);
		if (success)
			System.out.printf(
					"Withdraw %d from account %s. Balance is %.2f %n",70,
					account1.getName(), account1.getBalance()); 
		else System.out.printf("Ammount %d is not valid!%n", 70);
		success = account2.withdraw(1300);
		if (success)
			System.out.printf(
				"Withdraw %d from account %s. Balance is %.2f %n",1300,
				account2.getName(), account2.getBalance());
		else System.out.printf("Ammount %d is not valid!%n", 1300);
	}

}
