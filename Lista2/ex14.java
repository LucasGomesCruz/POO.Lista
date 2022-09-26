package Lista2.Aula3;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Peso = ");
		var peso = ler.nextDouble();

		System.out.print("Altura = ");
		var altura = ler.nextDouble();

		var imc = peso / (altura * altura);

		if(imc <= 18.4)
			System.out.print("--Abaixo do peso");
		else if(imc >= 18.5 && imc <= 24.9)
			System.out.print("--Peso normal");
		else if(imc >= 25 && imc < 29.9)
			System.out.print("--Sobrepeso");
		else if(imc >= 30 && imc <= 34.9)
			System.out.print("--Obesidade Grau 1");
		else if(imc >= 35 && imc <= 39.9)
			System.out.print("--Obesidade Grau 2");
		else
			System.out.print("--Obesidade Grau 3");
	}
}
