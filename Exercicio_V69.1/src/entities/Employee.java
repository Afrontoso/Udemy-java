package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		
		double newSalary = grossSalary*(percentage/100.0);
		double netSalary = NetSalary();
		newSalary += netSalary; 
		System.out.printf("%.2f%n", newSalary);
	}
}
