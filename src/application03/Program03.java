package application03;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo de media ponderada sobre tres casos de testes.");
		int n = 3;
		for(int i = 1; i < n; i++) {
			System.out.println();
			System.out.println("Caso de teste nº" + i + ": ");
			System.out.print("Digite o primeiro número que tera peso 2.0: ");
			double a = sc.nextDouble();
			System.out.print("Digite o segundo número que tera peso 3.0: ");
			double b = sc.nextDouble();
			System.out.print("Digite o terceiro número que tera peso 5.0: ");
			double c = sc.nextDouble();
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			System.out.printf("Resultado: %.1f%n", media);	
			System.out.println();
			}
		sc.close();
		}		
}