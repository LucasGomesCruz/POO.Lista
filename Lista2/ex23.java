package Lista2.Aula3;

import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("A = ");
		var a = ler.nextDouble();

		System.out.print("B = ");
		var b = ler.nextDouble();

		System.out.print("C = ");
		var c = ler.nextDouble();

		if(a+b < c)
			System.out.print("A + B é menor que C ");
		else
			System.out.print("A + B não é menor que C ");
	}
}
