package application04;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Divisao entre dois numeros.");
		System.out.print("Digite a quantidade de operações que serao realizadas: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Operação nº" + i + ": ");
			System.out.print("Digite o primeiro numero: ");
			double x = sc.nextDouble();
			System.out.print("Digite o segundo numero: ");
			double y = sc.nextDouble();
			while (y == 0) {
				System.out.println("A divisão por zero não é definida.");
				System.out.print("Digite o denominador novamente: ");
				y = sc.nextDouble();
			}
			double res = x / y;
			System.out.printf("O resultado é: %.2f%n", res);
			System.out.println();
			}
		
		sc.close();
	}
}
