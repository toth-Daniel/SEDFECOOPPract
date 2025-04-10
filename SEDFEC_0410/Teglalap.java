public class Teglalap
{
	protected int a, b, area, perimeter;

	public void Szamol1(int a, int b)
	{
		area = a * b;
		System.out.println("A terület: " + area);
	}

	public void Szamol2(int a, int b)
	{
		perimeter = a + a + b + b;
		System.out.println("A kerület: " + perimeter);
	}
	public Teglalap(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
