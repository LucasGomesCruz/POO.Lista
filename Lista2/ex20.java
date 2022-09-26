package Lista2.Aula3;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("P1 = ");
		var p1 = ler.nextDouble();

		double p2 = 0;
		double media = 0;

		while(media<5)
		{
			p2 += 0.1;
			media = (p1+2*p2)/3;
		}

		System.out.print(String.format("Ele precisa tirar %.2f na p2 para passar", p2));
	}
}
