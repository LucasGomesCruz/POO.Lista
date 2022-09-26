package Lista3.Aula4;

import java.util.Scanner;

public class ex41 {
	public static void main(String[] args) {
		var n = GetInt("Valor");
		var ini = 2;
		var a = 3;

		for(var x = 0; x <= n; x++)
		{
			System.out.println(ini);
			ini += a;
			a += 2;
		}
	}

	private static int GetInt(String txt)
	{
		var ler = new Scanner(System.in);
		var i = 0;

		System.out.print("\033[H\033[2J");  

		while(i <= 0 || i > 100)
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
				System.out.println("Valor maior que 0 e menor que 100");
				i = 0;
			}
		}
		
		return i;
	}
}
