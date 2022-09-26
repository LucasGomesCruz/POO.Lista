package Lista3.Aula4;

import java.util.Scanner;

public class ex50 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		var ini = 0;
		var fin = 0;
		
		System.out.print("Inicio = ");
		ini = ler.nextInt();

		do{
			System.out.print("\033[H\033[2J");  
			System.out.print("Final = ");
			fin = ler.nextInt();
		}while(ini >= fin);

		for(var x = ini; x <= fin; x++)
		{
			if(x > 10)
			{
				if(x % 2 == 0)
				System.out.println(x);
			}

		}
	}
}
