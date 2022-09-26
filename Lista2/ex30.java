package Lista2.Aula3;

import java.util.Scanner;

public class ex30 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);			

		System.out.print("\033[H\033[2J");  

		System.out.print("Condição de pagamento\n"+
		"1-À vista em dinheiro ou cheque, recebe 10% de desconto\n" +
		"2-À vista no cartão de crédito, recebe 15% de desconto\n" +
		"3-Em duas vezes, preço normal de etiqueta sem juros\n" +
		"4-Em quatro vezes, preço normal de etiqueta mais juros de 10%\n\n" +
		"-->");
		var op = ler.nextLine();

		System.out.print("\nValor = ");
		var v = ler.nextDouble();

		switch (op) {
			case "1":
			System.out.print("Valor a ser pago = " + v * 0.90);
				break;
			case "2":
			System.out.print("Valor a ser pago = " + v * 0.85);
				break;
			case "3":
			System.out.print("Valor a ser pago = 2 parcelas de" + v / 2);
				break;
			case "4":
			System.out.print("Valor a ser pago = 2 parcelas de" + v * 1.10);
				break;
			default:
			System.out.print("Opção invalida");
				break;
		}

	}
}
