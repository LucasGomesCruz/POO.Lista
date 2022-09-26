package Lista1.Aula2;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		System.out.print("\033[H\033[2J");  

		System.out.print("Produto 1 = ");
		var v1 = ler.nextDouble();

		System.out.print("Produto 2 = ");
		var v2 = ler.nextDouble();

		System.out.print("Produto 3 = ");
		var v3 = ler.nextDouble();

		System.out.print("Produto 4 = ");
		var v4 = ler.nextDouble();

		System.out.print("Produto 5 = ");
		var v5 = ler.nextDouble();

		System.out.print("Pagamento = ");
		var pag = ler.nextDouble();

		System.out.print("Troco = " + (pag - (v1 + v2 + v3 + v4 + v5)));
	}
}
