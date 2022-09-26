package Lista2.Aula3;

import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");

		System.out.print("Nome = ");
		var nome = ler.nextLine();

		System.out.print("Sexo = ");
		var sexo = ler.nextLine();

		System.out.print("Estado Civil = ");
		var ecivil = ler.nextLine();

		if(sexo.toLowerCase().equals("f") && ecivil.toLowerCase().equals("casada"))
		{
			System.out.print("Tempo de casada (anos) = ");
			var anos = ler.nextLine();
		}
	}	
}
