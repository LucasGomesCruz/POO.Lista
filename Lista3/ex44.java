package Lista3.Aula4;

import java.util.Scanner;

public class ex44 {
	public static void main(String[] args) {
		var max = 0;
		var soma = 0;

		System.out.print("\033[H\033[2J");  

		for(var x = 0; x <= 9; x++)
		{
			var a = GetInt(String.format("Valor %d", x + 1));
			if(a > max) max = a;
			soma += a;
		}

		var media = soma / 10;

		System.out.print("Maior = " + max);
		System.out.print("\nSoma = " + soma);
		System.out.print("\nMedia = " + media);
	}

	private static int GetInt(String txt)
	{
		var ler = new Scanner(System.in);
		var i = 0;

		while(i <= 0)
		{
			try
			{
				System.out.print(String.format("%s = ", txt));
				var s = ler.nextLine();
				i = Integer.parseInt(s);
				System.out.print("\033[H\033[2J");  
			}
			catch(Exception e)
			{
				System.out.println("Valor maior que 0");
				i = 0;
			}
		}
		
		return i;
	}
}
