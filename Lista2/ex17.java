package Lista2.Aula3;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		var ler2 = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Peso = ");
		var peso = ler.nextDouble();

		System.out.print("Altura = ");
		var altura = ler.nextDouble();

		System.out.print("Sexo = ");
		var sexo = ler2.nextLine();

		var imc = peso / (altura * altura);
		
		switch (sexo.toUpperCase())
		{
			case "F": {
				if(imc < 19)
					System.out.print("Abaixo do peso");
				else if(imc >= 19 && imc < 24)
					System.out.print("Peso normal");
				else
					System.out.print("Acima do peso");
			}
			break;
			case "M": {
				if(imc < 20)
					System.out.print("Abaixo do peso");
				else if(imc >= 20 && imc < 25)
					System.out.print("Peso normal");
				else
					System.out.print("Acima do peso");
			}
			break;
			default:
				System.out.print("Sexo Invalido, somente F e M");
			break;
		}
	}
}
