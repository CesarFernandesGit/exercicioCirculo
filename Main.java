import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.print("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		
		area = Math.PI * raio * raio;
				
		System.out.printf("A área do círculo é de %.3f%n", area);
		area = sc.nextDouble();
		
		sc.close();
	}

}
