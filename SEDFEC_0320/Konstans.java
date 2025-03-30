package SEDFEC.src.hu.me.sedfec;

public class Konstans {

	public static void main(String[] args) {

		final String SZOVEG1 = "A gömb felszíne: ";
		final String SZOVEG2 = "A gömb térfogata: ";

		double radius = 3, spheresurface, spherevolume;

		spheresurface = 4 * Math.pow(radius, 3) * Math.PI;
		spherevolume = 4 * Math.pow(radius, 3) * Math.PI/3;

		System.out.println("A gömb sugara: " + radius);
		System.out.println(SZOVEG1 + spheresurface);
		System.out.println(SZOVEG2 + spherevolume);

	}
}
