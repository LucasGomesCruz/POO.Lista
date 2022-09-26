package Lista2.Aula3;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		
		System.out.print("\033[H\033[2J");  
		
		System.out.print("Aceleracao = ");
		var a = ler.nextDouble();

		System.out.print("Velocidade inicial = ");
		var vi = ler.nextDouble();

		System.out.print("Tempo = ");
		var t = ler.nextDouble();

		var v = (vi + a * t) * 3.6;

		if(v <= 40)
			System.out.print("Veiculo muito lento");
		else if(v > 40 && v <= 60)
			System.out.print("Velocidade permitida");
		else if(v > 60 && v <= 80)
			System.out.print("Velocidade de cruzeiro");
		else if(v > 80 && v <= 120)
			System.out.print("Veiculo rapido");
		else
			System.out.print("Veiculo muito rapido");
	}
}
