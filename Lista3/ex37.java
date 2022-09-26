package Lista3.Aula4;

import java.util.Scanner;

public class ex37 {
	public static void main(String[] args) {
		var ler = new Scanner(System.in);

		for(var x = 1; x <= 20; x++)
		{
			for(var y = 1; y <= 10; y++)			
				System.out.println(String.format("%d * %d = %d", x, y, x * y));			

			System.out.println("Pressione algo");
			ler.nextLine();
		}
	}
}
