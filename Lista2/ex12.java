package Lista2.Aula3;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Base = ");
		var base = ler.nextDouble();

		System.out.print("Altura = ");
		var altura = ler.nextDouble();

		var area = base * altura;

		System.out.print("Area = " + area);
		if(area > 100)
			System.out.print("\n--Terreno Grande--");
		else
			System.out.print("\n--Terreno Pequeno--");
	}
}
