package Lista1.Aula2;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Celsius = ");
		var celsius = ler.nextDouble();

		System.out.print("Fahrenheit  = " + (celsius * 1.8 + 32));
	}
}
