package Lista3.Aula4;

public class ex39 {
	public static void main(String[] args) {
		var v1 = 0;
		var v2 = 1;
		var a = 0;

		System.out.println(v1);
		System.out.println(v2);
		for (var x = 0; x <= 28; x++)
		{
			a = v1;
			v1 = v2;
			v2 = v1 + a;
			System.out.println(v2);
		}
	}
}
