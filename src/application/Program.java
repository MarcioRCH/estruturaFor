package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que mostra todos os numeros ímpares maiores que zero até o múmero informado.");
		System.out.println();
		System.out.print("Informe um número inteiro qualquer: ");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.print("Digite apenas números maiores que zero: ");
			n = sc.nextInt();
		}
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
