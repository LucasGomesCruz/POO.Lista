package Lista2.Aula3;

import java.util.Scanner;

public class ex28 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Valor 1 = ");
		var v1 = ler.nextInt();

		System.out.print("Valor 2 = ");
		var v2 = ler.nextInt();

		System.out.print("Valor 3 = ");
		var v3 = ler.nextInt();
		
		if(v1 != v2 && v2 != v3)
		{
			if(v1 > v2)
			{
				if(v2 > v3)
					System.out.println(String.format("%d, %d, %d", v3, v2, v1));
				else
				{
					if(v1 > v3)
						System.out.println(String.format("%d, %d, %d", v2, v3, v1));
					else
						System.out.println(String.format("%d, %d, %d", v2, v1, v3));
				}
			}
			else
			{
				if(v1 > v3)
					System.out.println(String.format("%d, %d, %d", v3, v1, v2));
				else
				{
					if(v2 > v3)
						System.out.println(String.format("%d´, %d, %d", v1, v3, v2));
					else
						System.out.println(String.format("%d´, %d, %d", v1, v2, v3));
				}
			}
		}
		else
			System.out.println("Todos tem de ser diferentes");
	}
}
