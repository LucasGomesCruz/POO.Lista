package Lista4.Aula5;

import java.util.Scanner;

public class ex53 {

	public static void main(String[] args) 
	{
		var ler = new Scanner(System.in);
		var lstAlunos = new Aluno[1];

		for(var x = 0; x <= lstAlunos.length - 1; x++)
		{		
			var aluno = new Aluno();

			aluno.ra = GetString("Ra");
			aluno.nome = GetString("Nome");

			var lstMateria = new String[6];
			for(var y = 0; y <= 5; y++)
			{
				lstMateria[y] = GetString(String.format("Materia %d", y+1));
			}
			System.out.print("\033[H\033[2J");  

			aluno.periodo = GetPeriodo("Periodo");

			lstAlunos[x] = aluno;
		}

		System.out.print("\033[H\033[2J");  
		System.out.println("");
		for (Aluno aluno : lstAlunos)
			if(aluno.periodo.equals("noite"))
				System.out.println(aluno.nome + " - Periodo: " + aluno.periodo);
	}

	private static String GetString(String txt)
	{
		var ler = new Scanner(System.in);
		System.out.print("\033[H\033[2J");  
		System.out.println(String.format("%s = ", txt));
		return ler.nextLine();
	}

	private static String GetPeriodo(String txt)
	{
		var s = "";
		var op = true;
		while(op)
		{
			var ler = new Scanner(System.in);
			System.out.println(String.format("%s = ", txt));
			s = ler.nextLine();
			System.out.print("\033[H\033[2J");  

			switch (s.toLowerCase()) {
				case "manha":
				case "noite":
				case "tarde":
					op = false;
					break;
				default:
				System.out.println("Apenas : manha, tarde e noite");
					break;
			}
		}
		return s;
	}
}
