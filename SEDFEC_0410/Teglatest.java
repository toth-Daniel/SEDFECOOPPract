public class Teglatest extends Teglalap
{
	private int a, b, c, volume, surface;


	public void Szamol1(int a, int b, int c)
	{
		volume = a * b * c;
		System.out.println("A térfogat: " + volume);
	}

	public void Szamol2(int a, int b, int c) {
		surface = 2 * (a * b + b * c + c * a);
		System.out.println("A felület: " + surface);
	}

	public Teglatest(int a, int b) {
		super(a, b);
	}
}
