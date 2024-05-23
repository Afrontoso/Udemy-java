package entities;

public class Rectangle {

	public double width;
	public double length;
		
		
	public double area() {
		
		return width*length;
		
	}
	
	public double perimeter() {
		
		return 2 * (width + length);
		
	}
		
	public double diagonal() {
		
		double raiz = Math.pow(width, 2) + Math.pow(length, 2);
		return Math.sqrt(raiz);
		
	}
}
