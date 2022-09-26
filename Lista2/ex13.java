package Lista2.Aula3;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Valor 1 = ");
		var v1 = ler.nextDouble();

		System.out.print("Valor 2 = ");
		var v2 = ler.nextDouble();

		System.out.print("Valor 3 = ");
		var v3 = ler.nextDouble();

		if(v1 > v2)
		{
			if(v1 > v3)
				System.out.print("\nMaior = " + v1);
			else
				System.out.print("\nMaior = " + v3);
		}
		else
		{
			if(v2 > v3)
				System.out.print("\nMaior = " + v2);
			else
				System.out.print("\nMaior = " + v3);
		}
	}
}
