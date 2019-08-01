package ch08_ClassesAndObjects;

public class Employee {
	
	private String firstName, lastName;
	private double salary; // monthly
	
	public Employee(String firstName,String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName ;
		this.salary = salary;
	}
	
	public void setSalary(double salary) {this.salary = salary;}
	public double getSalary() {return salary;}
	
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getFirstName() {return firstName;}
	
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getLastName() {return lastName;}
	
	public double getYearlySalary() {return salary * 12;}
	
	public double raiseSalary(double percent) {
		if (percent > 0)
			salary += salary * (percent/100);
		return salary;
	}

}
