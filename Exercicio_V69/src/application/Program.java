package application;

import java.util.*;
import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Rectangle x;
	
	x = new Rectangle();
	
	System.out.println("Enter rectangle width and height:");
	x.width = sc.nextDouble();
	x.length = sc.nextDouble();
	
	//double area = x.area();
	//double perimeter = x.perimeter();
	//double diagonal = x.diagonal();
	
	System.out.printf("AREA = %.2f%n", x.area());
	System.out.printf("PERIMETER = %.2f%n", x.perimeter());
	System.out.printf("DIAGONAL = %.2f%n", x.diagonal());
	
	sc.close();
	}
}
