import java.text.DecimalFormat;

public class Metodus0 {

	public static void main(String[] args) {

		double adat1 = 20, adat2 = 40;
		EredmenyKiir(adat1, adat2);
	}

	public static double SzamtaniKozep(int x, int y) {

		double result;
		result = (x + y)/2;
		return result;
	}

	public static double MertaniKozep(double x, double y) {

		double result;
		result = Math.sqrt(x * y);
		return result;
	}

	public static void EredmenyKiir(double x, double y) {

		double result;
		result = SzamtaniKozep(20, 40);

		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("számtani közép: " + df.format(result));

		result = MertaniKozep(20, 40);
		System.out.println("mértani közép: " + df.format(result));
	}
}
