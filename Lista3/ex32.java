package Lista3.Aula4;

import java.util.Scanner;

public class ex32 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		int v1 = 0, v2 = 0;

		while(v1 >= v2)
		{
			System.out.print("\033[H\033[2J");  

			System.out.print("Valor 1 = ");
			v1 = ler.nextInt();
			System.out.print("Valor 2 = ");
			v2 = ler.nextInt();
		}
	}
}
