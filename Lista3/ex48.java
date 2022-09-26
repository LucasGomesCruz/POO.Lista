package Lista3.Aula4;

import java.util.Scanner;

public class ex48 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		var fin = 0;
		do{
			System.out.print("\033[H\033[2J");  
			System.out.print("Inicio = ");
			fin = ler.nextInt();
		}while(fin <= 0);
		
		for(var x = fin; x <= 20; x++)
			System.out.println(x+1);
	}
}
