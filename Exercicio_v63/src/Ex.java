import java.util.*;

public class Ex {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		double p = (a + b + c)/2;
		double areaX = (p*(p-a)*(p-b)*(p-c));
		areaX = Math.sqrt(areaX);
		
		p = (d + e + f)/2;
		double areaY = (p*(p-d)*(p-e)*(p-f));
		areaY = Math.sqrt(areaY);
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX < areaY) {
			System.out.println("Larger area: Y");
		}
		else {
			System.out.println("Larger area: X");
		}
		
		sc.close();
	}

}
