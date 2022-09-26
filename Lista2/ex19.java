package Lista2.Aula3;

import java.util.Scanner;

public class ex19 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("P1 = ");
		var p1 = ler.nextDouble();

		System.out.print("P2 = ");
		var p2 = ler.nextDouble();

		var media = (p1+2*p2)/3;

		if(media >= 5)
			System.out.print("Aprovado");
		else
			System.out.print("Reprovado");
	}
}
