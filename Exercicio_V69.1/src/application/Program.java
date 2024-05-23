package application;

import java.util.*;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Employee fulano = new Employee();  
	
	System.out.print("Name: ");
	fulano.name = sc.nextLine();
	System.out.print("Gross salary: ");
	fulano.grossSalary = sc.nextDouble();
	System.out.print("Tax: ");
	fulano.tax = sc.nextDouble();
	
	System.out.printf("Employee: %s, $ %.2f%n", fulano.name, fulano.NetSalary());
	System.out.print("Whith percentage to increase salary? ");
	
	double percentage = sc.nextDouble();
	
	
	System.out.printf("Updated data: %s, $ ", fulano.name);
	fulano.IncreaseSalary(percentage);
	

	sc.close();
	
	}
}
