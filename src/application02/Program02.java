package application02;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ler um número N que será a quantidade de numeros X dentro de um intervalo [10,20] e mostrar quantos estão dentro e fora deste intervalo");
		System.out.println();
		System.out.print("Digite a quantidades de numeros que serão informados: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.print("Digite apenas números maiores que zero: ");
			n = sc.nextInt();
		}
		System.out.println("Digite cada um dos numeros inteiros pressionando ENTER em cada um: ");
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x  >= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		System.out.println("Dentro do intervalo: " + in);
		System.out.println("Fora do intervalo: " + out);
		
		sc.close();

	}

}
