import java.util.*;

public class Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();
		
		String resp = (x > 10) ? "Sou muito lindo!" : "Sou muito gostoso!";
		//Expressão condicional ternária
		
		System.out.println(resp);
		
		sc.close();
	}


}
