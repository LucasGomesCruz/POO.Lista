package Lista1.Aula2;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Aresta = ");
		var aresta = ler.nextInt();

		System.out.print("Area = " + aresta * aresta);
	}
}
