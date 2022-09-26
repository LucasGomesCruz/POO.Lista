package Lista3.Aula4;

import java.util.Scanner;

public class ex47 {
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");  

		var ler = new Scanner(System.in);		
		var ler2 = new Scanner(System.in);		
		var f = 0;
		var a = 0;
		var op = "s";

		while(op.toLowerCase().equals("s"))
		{
			System.out.print("\033[H\033[2J");  
			do{
				System.out.print("valor = ");
				a = ler.nextInt();
			}while(a <= 0);

			for(f = 1; a > 1; a = a - 1)
			{
				f = f * a;
			}

			System.out.print("\033[H\033[2J");  
			System.out.println("valor = " + f);

			while(true)
			{
				System.out.println("De novo? s/n = ");
				op = ler2.nextLine();

				if(op.toLowerCase().equals("s") || op.toLowerCase().equals("n"))
					break;
			}
		}
	}
}
