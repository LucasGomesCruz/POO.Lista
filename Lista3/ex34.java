package Lista3.Aula4;

public class ex34 {
	public static void main(String[] args) {
		System.out.print("\033[H\033[2J");  
		
		for(var x = 1; x <= 10; x++)		
			System.out.println(String.format("5 * %d = %d", x,  x * 5));		
	}
}
