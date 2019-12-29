package application07;

import java.util.Locale;
import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler um número inteiro positivo N e então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor");
		System.out.print("Digite um numero inteiro positivo: ");
		int n = sc.nextInt();
		while(n <= 0 ) {
			System.out.print("Digite novamente, apenas numeros inteiros positivos: ");
			n = sc.nextInt();
		}
		System.out.println("Nº de linhas, quadrado, cubo");
		for(int i = 1; i <= n; i++) {
			int n1 = i * i;
			int n2 = i * i * i;
			System.out.printf("%d, %d, %d%n", i, n1, n2);
		}
		sc.close();
	}

}
