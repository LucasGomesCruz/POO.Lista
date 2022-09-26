package Lista3.Aula4;

import java.util.Scanner;

public class ex33 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		var s = "";
		while(true)
		{
			System.out.print("\033[H\033[2J");  
			System.out.print("Sexo = ");
			s = ler.nextLine();

			if(s.equals("F") || s.equals("M"))
				break;
		}
	}
}
