import java.util.*;

// ainda não funciona

public class Ex_funçao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int higher = max(x);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int y) {
		int xuy = 0;
		int cont = 0;
		
		while (cont < 3) {

			if (y >= xuy) {
				xuy = y;
			}
			
			cont++;
		}
		
		return xuy;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}	
}
