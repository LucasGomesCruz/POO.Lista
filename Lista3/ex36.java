package Lista3.Aula4;

import java.util.Scanner;

public class ex36 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		int v = 0, i = 0, f = 0;

		v = Get(v, "Valor");
		i = Get(i, "Inicio");

		while(f <= i)
			f = Get(0, "Final");

		System.out.print("\033[H\033[2J");  

		for(var x = f; x >= i; x--)
			System.out.println(String.format("%d * %d = %d", v, x,  x * v));
	}

	private static int Get(int i, String txt)
	{
		var ler = new Scanner(System.in);

		while(i <= 0)
		{
			try
			{
				System.out.print("\033[H\033[2J");  
				System.out.print(String.format("%s = ", txt));
				var s = ler.nextLine();
				i = Integer.parseInt(s);
			}
			catch(Exception e)
			{
				i = 0;
			}
		}

		return i;
	}
}
