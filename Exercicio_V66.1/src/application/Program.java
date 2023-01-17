package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		double totalValueInStock = price * quantity;
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total : $ %.2f%n",
				name, price, quantity, totalValueInStock);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantityAdd = sc.nextInt();
		quantity += quantityAdd;
		totalValueInStock = price * quantity;
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total : $ %.2f%n",
				name, price, quantity, totalValueInStock);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int quantityRemo = sc.nextInt();
		quantity -= quantityRemo;
		totalValueInStock = price * quantity;
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total : $ %.2f%n",
				name, price, quantity, totalValueInStock);
		
		
		sc.close();
		
	}

}
