import java.util.*;

public class teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); //mudar de localidade
		Scanner sc = new Scanner(System.in);
		
		String y;
		int x;
		double z;
		char w;
		
		y = sc.next();
		x = sc.nextInt();
		z = sc.nextDouble();
		w = sc.next().charAt(0);
		
		
		System.out.println("Voce digitou o nome: " + y);
		System.out.println("Voce digitou o número: " + x);
		System.out.printf("Voce digitou o número: %.2f%n", z);
		System.out.println("A primeira letra que você digitou é: " + w);
		
		sc.close();
	}

}
