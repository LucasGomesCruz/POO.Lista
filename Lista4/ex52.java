package Lista4.Aula5;

import java.util.Scanner;

public class ex52 {
	
	public static void main(String[] args) 
	{
		var lstProdutos = new Produto[10];

		for(var x = 0; x <= lstProdutos.length - 1; x++)
		{		
			var produto = new Produto();

			produto.id = GetInt("Id");
			produto.descricao = GetString("Descricao");
			produto.valor = GetDouble("Idade");
			produto.quatidade = GetDouble("Quantidade");

			lstProdutos[x] = produto;
		}

		System.out.print("\033[H\033[2J");  
		System.out.println("Menores de R$100");
		for (Produto produto : lstProdutos)
			if(produto.valor < 100)
				System.out.println(produto.id + " - R$" + produto.valor);
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

	private static double GetDouble(String txt)
	{
		var ler = new Scanner(System.in);
		double i = 0;

		while(i <= 0)
		{
			try
			{
				System.out.print("\033[H\033[2J");  
				System.out.println(String.format("%s = ", txt));
				var s = ler.nextLine();
				i = Double.parseDouble(s);
			}
			catch(Exception e)
			{
				i = 0;
			}
		}
		
		return i;
	}
}
