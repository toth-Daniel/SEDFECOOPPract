public class Muvelet extends SzMK implements HatGyok
{
	@Override
	public double powerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	@Override
	public double rootOf(double base, double exponent) {
		return Math.pow(base, 1.0 / exponent);
	}

	@Override
	public double arithmeticMean(double a, double b) {
		return (a + b) / 2.0;
	}

	@Override
	public double geometricalMean(double a, double b) {
		return Math.sqrt(a * b);
	}

	public double addition(double a, double b) {
		return a + b;
	}

	public double multiplication(double a, double b) {
		return a * b;
	}
}
