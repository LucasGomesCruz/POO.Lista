package Lista2.Aula3;

import java.util.Scanner;


public class ex25 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("valor = ");
		var v = ler.nextDouble();

		if(v%2 == 0)
			System.out.print("Par");
		else
			System.out.print("Impar");
	}
}
