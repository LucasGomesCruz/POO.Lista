package Lista1.Aula2;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Base = ");
		var base = ler.nextDouble();

		System.out.print("Altura = ");
		var altura = ler.nextDouble();

		System.out.print("Area = " + (base * altura) / 2);
	}
}
