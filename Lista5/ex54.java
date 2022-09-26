package Lista5.Aula6;

import java.util.Scanner;

public class ex54 {

    public static void main(String[] args) {
        var lstCliente = new Cliente[5];

        for(var x = 0; x <= lstCliente.length - 1; x++) 
        {
            var id = GetInt("Id");
            var nome = GetString("Nome");
            var idade = GetInt("Idade");
            var email = GetString("Email");

            if(HasAccount())
            {
                var agencia = GetString("Agencia");
                var numero = GetString("Numero");
                var saldo = GetDouble("Saldo");

                lstCliente[x] = new Cliente(id, nome, idade, email, new ContaBancaria(agencia, numero, saldo));
            }
            else
                lstCliente[x] = new Cliente(id, nome, idade, email, new ContaBancaria());         
        }

        for (var cliente : lstCliente) {
            System.out.print("\033[H\033[2J");  
            System.out.println(cliente.exibirNomeIdade());
            System.out.println(cliente.exibirDadosConta());
            System.out.println("\n\n");
        }
	}

    private static boolean HasAccount()
    {
        boolean op = false;

        while(true)
        {
            var ler = new Scanner(System.in);
            System.out.print("\033[H\033[2J");  
            System.out.println("Tem conta bancaria? S/N ->");
            var strOp = ler.nextLine();
            if(strOp.toLowerCase().equals("s"))
            {
                op = true;
                break;
            }

            if(strOp.toLowerCase().equals("n"))
            {
                op = false;
                break;
            }
        }

        return op;
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
