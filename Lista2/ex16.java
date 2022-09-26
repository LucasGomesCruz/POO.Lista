package Lista2.Aula3;

import java.util.Scanner;

public class ex16 {
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
			if(v1 > v2)
			{
				if(v1 > v3)
					if((v1 * v1) == (v2 * v2 + v3 * v3))
						System.out.print("É um triangulo retangulo");
					else
						System.out.print("NÃO é um triangulo retangulo");
				else
					if((v3 * v3) == (v2 * v2 + v1 * v1))
						System.out.print("É um triangulo retangulo");
					else
						System.out.print("NÃO é um triangulo retangulo");
			}
			else
			{
				if(v2 > v3)
					if((v2 * v2) == (v1 * v1 + v3 * v3))
						System.out.print("É um triangulo retangulo");
					else
						System.out.print("NÃO é um triangulo retangulo");
				else
					if((v3 * v3) == (v2 * v2 + v1 * v1))
						System.out.print("É um triangulo retangulo");
					else
						System.out.print("NÃO é um triangulo retangulo");
			}
		}
	}
}
