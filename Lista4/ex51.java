package Lista4.Aula5;

import java.util.Scanner;

public class ex51 {

	public static void main(String[] args) 
	{
		var ler = new Scanner(System.in);
		var lstClients = new Cliente[5];

		for(var x = 0; x <= lstClients.length - 1; x++)
		{		
			var cliente = new Cliente();

			cliente.id = GetInt("Id");
			cliente.nome = GetString("Nome");
			cliente.idade = GetInt("Idade");
			cliente.email = GetString("Email");

			lstClients[x] = cliente;
		}

		System.out.print("\033[H\033[2J");  
		System.out.println("Maiores de idade");
		for (Cliente cliente : lstClients)
			if(cliente.idade > 18)
				System.out.println(cliente.nome + " - " + cliente.idade + " anos");
	}

	private static String GetString(String txt)
	{
		var ler = new Scanner(System.in);
		System.out.print("\033[H\033[2J");  
		System.out.println(String.format("%s = ", txt));
		return ler.nextLine();
	}

	private static int GetInt(String txt)
	{
		var ler = new Scanner(System.in);
		var i = 0;

		while(i <= 0)
		{
			try
			{
				System.out.print("\033[H\033[2J");  
				System.out.println(String.format("%s = ", txt));
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