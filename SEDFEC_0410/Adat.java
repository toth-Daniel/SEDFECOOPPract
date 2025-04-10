public class Adat
{
	protected int a, b;

	public Adat(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void Szamol()
	{
		double average = (double) ((a + b) / 2.0);
		System.out.println("A számtani közép: " + average);
	}

}
