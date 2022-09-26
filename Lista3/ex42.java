package Lista3.Aula4;

import java.util.Scanner;

public class ex42 {
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");  
		
		var n = GetInt("Valor");

		for(var x = 0; x <= n; x++)
			System.out.println((x+1) +"/"+ (x+2));
	}

	private static int GetInt(String txt)
	{
		var ler = new Scanner(System.in);
		var i = 0;

		while(i <= 0 || i > 50)
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
				System.out.println("Valor maior que 0 e menor que 50");
				i = 0;
			}
		}
		
		return i;
	}
}
