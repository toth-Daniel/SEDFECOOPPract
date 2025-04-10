public class Interfesz1
{
	public static void main(String[] args) {
		Muvelet m = new Muvelet();

		double a = 4, b = 2;

		System.out.println("Számtani közép: " + m.arithmeticMean(a, b));
		System.out.println("Mértani közép: " + m.geometricalMean(b, a));
		System.out.println("Gyökvonás: " + m.rootOf(a, b));
		System.out.println("Hatványozás: " + m.powerOf(a, b));
		System.out.println("Összeadás: " + m.addition(a, b));
		System.out.println("Szorzás: " + m.multiplication(a, b));
	}
}
