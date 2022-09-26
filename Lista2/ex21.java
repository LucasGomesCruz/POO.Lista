package Lista2.Aula3;

import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		var decisao = "0";
			
		while(!decisao.equals("5"))
		{
			System.out.print("\033[H\033[2J");

			System.out.print("1-multiplicacao\n2-adicao\n3-divisao\n4-subtracao\n5-fim de processo\n\nescolha uma opcao ->");
			decisao = ler.nextLine();

			switch (decisao) 
			{
				case "1": {
					System.out.print("\033[H\033[2J");  
					var v1 = GetValue(1);
					var v2 = GetValue(2);
					System.out.println(String.format("%.1f * %.1f = %.1f", v1, v2, v1 * v2));

					System.out.println("Pressione algo");
					ler.nextLine();
				}
				break;
				case "2": {
					System.out.print("\033[H\033[2J");  
					var v1 = GetValue(1);
					var v2 = GetValue(2);
					System.out.println(String.format("%.1f + %.1f = %.1f", v1, v2, v1 + v2));

					System.out.println("Pressione algo");
					ler.nextLine();
				}
				break;
				case "3": {
					System.out.print("\033[H\033[2J");  
					var v1 = GetValue(1);
					
					if(v1==0)
						System.out.println("Não dividirás por 0");
					else
					{
						var v2 = GetValue(2);
						if(v2==0)
							System.out.println("Não dividirás por 0");
						else
							System.out.println(String.format("%.1f / %.1f = %.1f", v1, v2, v1 / v2));
					}

					System.out.println("Pressione algo");
					ler.nextLine();
				}
				break;
				case "4": {
					System.out.print("\033[H\033[2J");  
					var v1 = GetValue(1);
					var v2 = GetValue(2);
					System.out.println(String.format("%.1f * %.1f - %.1f", v1, v2, v1 - v2));

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
					System.out.print("\033[H\033[2J");  
					System.out.println("Opcao invalida");
					System.out.println("Pressione algo");
					ler.nextLine();
				break;
			}
		}		
	}
	
	private static double GetValue(int value){
		var ler = new Scanner(System.in);
		System.out.print(String.format("Valor %d = ", value));
		return ler.nextDouble();
	}
}
