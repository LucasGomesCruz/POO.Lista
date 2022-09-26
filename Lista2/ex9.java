package Lista2.Aula3;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Valor 1 = ");
		var val1 = ler.nextDouble();

		System.out.print("Valor 1 = ");
		var val2 = ler.nextDouble();

		if(val1 > val2)
			System.out.print(String.format("Valor %.2f é menor", val2));
		else
			System.out.print(String.format("Valor %.2f é menor", val1));
	}
}
