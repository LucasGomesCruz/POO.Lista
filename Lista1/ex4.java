package Lista1.Aula2;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Valor 1 = ");
		var v1 = ler.nextDouble();

		System.out.print("Valor 2 = ");
		var v2 = ler.nextDouble();

		System.out.print("Valor 3 = ");
		var v3 = ler.nextDouble();

		System.out.print("Valor 4 = ");
		var v4 = ler.nextDouble();

		System.out.print("Media = " + (v1 + v2 + v3 + v4) / 4);
	}
}
