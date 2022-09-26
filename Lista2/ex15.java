package Lista2.Aula3;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Triangulo lado 1 = ");
		var v1 = ler.nextInt();

		System.out.print("Triangulo lado 2 = ");
		var v2 = ler.nextInt();

		System.out.print("Triangulo lado 3 = ");
		var v3 = ler.nextInt();

		if((v1 + v2) < v3 || (v1 + v3) < v2 || (v2 + v3) < v1)
			System.out.print("Não é um triangulo");
		else
		{
			if(v1 == v2 && v2 == v3)
				System.out.print("Triangulo equilatero");
			else if(v1 != v2 && v2 != v3)
				System.out.print("Triangulo escaleno");
			else
				System.out.print("Triangulo isoceles");
		}
	}
}
