package Lista1.Aula2;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Cotação $ = ");
		var cot = ler.nextDouble();

		System.out.print("Quantidade = ");
		var qt = ler.nextDouble();

		System.out.print("R$ = " + cot * qt);
	}
}
