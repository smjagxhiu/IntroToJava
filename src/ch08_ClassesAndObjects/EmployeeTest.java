package ch08_ClassesAndObjects;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("John","Doe",500);
		Employee e2 = new Employee("Jane","Doe",600);
		
		System.out.printf("Employee %s %s has a yearly salary of %.2f%n", 
				e1.getFirstName(),e1.getLastName(),e1.getYearlySalary());
		System.out.printf("Employee %s %s has a yearly salary of %.2f%n", 
				e2.getFirstName(),e2.getLastName(),e2.getYearlySalary());
		
		double raicePercent = 10;
		e1.raiseSalary(raicePercent);
		System.out.printf("Employee %s %s has a monthly salary of %.2f%n",
				e1.getFirstName(),e1.getLastName(),e1.getSalary());
		System.out.printf("Employee %s %s has a yearly salary of %.2f%n", 
				e1.getFirstName(),e1.getLastName(),e1.getYearlySalary());
	}

}
