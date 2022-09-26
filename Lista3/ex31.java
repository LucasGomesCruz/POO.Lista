package Lista3.Aula4;

import java.util.Scanner;

public class ex31 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		double valor = 0;

		while(valor < 1)
		{
			System.out.print("\033[H\033[2J");  
			System.out.print("Digite um valor positivo = ");
			valor = ler.nextDouble();
		}
	}
}
