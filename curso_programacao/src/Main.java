import java.util.*;

public class Main {

	public static void main(String[] args) {
		int x = 30;
		double y = 87.7802789;
		String nome = "Victor";
		int idade = 25;
		double renda = 600.0;
			
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.printf("%.2f%n", y);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.4f%n", y);
		System.out.printf("%.6f%n", y);
		System.out.println("Resultado = " + y + " METROS");
		System.out.printf("Resultado = %.2f metros%n", y);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		System.out.println("Olá mundo!");
	}

}
