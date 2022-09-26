package Lista3.Aula4;

import java.util.Scanner;

public class ex45 {
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");  

		var n = GetIntN("N");
		var min = 0;
		var max = 0;
		var soma = 0;
		var media = 0;
		var neg = 0;
		var pos = 0;

		for(var x = 0; x <= n - 1; x++)
		{
			var a = GetInt(String.format("Valor %d", x + 1));

			if(a > max) max = a;
			if(x == 0) min = a;
			if(a < min) min = a;
			if(a < 0) neg++;
			else pos++;

			soma += a;
		}

		media = soma / n;

		System.out.print("\033[H\033[2J");  

		System.out.print("Maior = " + max);
		System.out.print("\nMenor = " + min);
		System.out.print("\nSoma = " + soma);
		System.out.print("\nMedia = " + media);
		System.out.print("\nPositivos em % = " + ((pos * 100) / n));
		System.out.print("\nNegativos em % = " + ((neg * 100) / n));
	}

	private static int GetIntN(String txt)
	{
		var ler = new Scanner(System.in);
		var i = 0;

		while(i <= 0 || i > 20)
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
				System.out.println("Valor maior que 0 e menor que 20");
				i = 0;
			}
		}
		
		return i;
	}

	private static int GetInt(String txt)
	{
		var ler = new Scanner(System.in);
		var i = 0;

		while(true)
		{
			try
			{
				System.out.print("\033[H\033[2J");  
				System.out.print(String.format("%s = ", txt));
				var s = ler.nextLine();
				i = Integer.parseInt(s);
				break;
			}
			catch(Exception e)
			{
				i = 0;
			}
		}
		
		return i;
	}
}
