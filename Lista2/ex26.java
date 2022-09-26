package Lista2.Aula3;

import java.util.Scanner;

public class ex26 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);
		System.out.println("Nome = ");
		var v = ler.nextDouble();
		if(v>0)
			System.out.println(v * 2);
		else
			System.out.println(v * 3);
	}
}
