public class UjAdat extends Adat
{
	private double sum;

	public UjAdat(int a, int b)
	{
		super(a, b);
	}

	@Override
	public void Szamol()
	{
		sum = Math.sqrt(a * b);
		System.out.println("A mértani közép: " + sum);
	}

	public double getSum()
	{
		return sum;
	}

}
