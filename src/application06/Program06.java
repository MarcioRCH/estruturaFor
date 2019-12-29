package application06;

import java.util.Locale;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo dos divisores de um número inteiro.");
		System.out.print("Digite o número inteiro que será calculado seus divisores: ");
		int n = sc.nextInt();
		System.out.print("Os divisores de " + n + ", são: ");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + ".");
			}
		}		
		sc.close();
	}
}
