package Lista2.Aula3;

import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		var decisao = "0";
		while(!decisao.equals("5"))
		{
			System.out.print("\033[H\033[2J");

			System.out.print("1-triangulo\n2-quadrado\n3-retangulo\n4-circulo\n5-fim de processo\n\nescolha uma opcao ->");
			decisao = ler.nextLine();

			switch (decisao) 
			{
				case "1": {
					System.out.print("\033[H\033[2J");  
					var v1 = GetValue("base");
					var v2 = GetValue("altura");
					System.out.println(String.format("Area = %.1f", (v1 * v2) / 2));

					System.out.println("Pressione algo");
					ler.nextLine();
				}
				break;
				case "2": 
				case "3": {
					System.out.print("\033[H\033[2J");  
					var v1 = GetValue("base");
					var v2 = GetValue("altura");
					System.out.println(String.format("Area = %.1f", v1 * v2));

					System.out.println("Pressione algo");
					ler.nextLine();
				}
				break;
				case "4": {
					System.out.print("\033[H\033[2J");  
					var v1 = GetValue("raio");
					System.out.println(String.format("Area = %.1f", 3.14 * (v1 * v1)));

					System.out.println("Pressione algo");
					ler.nextLine();
				}
				break;
				case "5": {
					System.out.print("\033[H\033[2J");  
					System.out.println("Tchau");
				}
				break;
				default:
				{
					System.out.print("\033[H\033[2J");  
					System.out.println("Opcao invalida");
					System.out.println("Pressione algo");
					ler.nextLine();
				}
				break;
			}
		}		
	}
	
	private static double GetValue(String a){
		var ler = new Scanner(System.in);
		System.out.print(String.format("Valor %s = ", a));
		return ler.nextDouble();
	}
}
