package Lista3.Aula4;

import java.util.Scanner;

public class ex35 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		int v = 0;

		while(v <= 0)
		{
			try
			{
				System.out.print("\033[H\033[2J");  
				System.out.print("Valor = ");
				var s = ler.nextLine();
				v = Integer.parseInt(s);
			}
			catch(Exception e)
			{
				v = 0;
			}
		}

		for(var x = 1; x <= 10; x++)
		{
			System.out.println(String.format("%d * %d = %d", v, x,  x * v));
		}
	}
}
