package application05;

import java.util.Locale;
import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo fatorial de um número.");
		System.out.print("Digite o numero que será calculado seu fatorial: ");
		int n = sc.nextInt();
		int fat = 1;
		for(int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		System.out.println("Fatorial de " + n + " é : " + fat);
		
		sc.close();
	}

}
