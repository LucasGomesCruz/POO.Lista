package Lista3.Aula4;

public class ex40 {
	public static void main(String[] args) {
		var v1 = 1;
		var v2 = 1;
		var v3 = 1;
		var a = 0;

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		for (var x = 0; x <= 27; x++)
		{
			a = v1;
			v1 = v2;
			v2 = v3;
			v3 = v1 + v2 + a;
			System.out.println(v3);
		}
	}
}
