package SEDFEC.src.hu.me.sedfec;

public class For {

	public static void main(String[] args) {

		int evenSum = 0, evenAverage = 0, number = 0;
		double oddProduct = 1, oddRoot = 0;

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				evenSum += i;
				number++;
			}
			else {
				oddProduct *= i;
			}
		}
		evenAverage = (evenSum / 10);
		oddRoot = Math.sqrt(oddProduct);

			System.out.println("A páros számok összege: " + evenSum);
			System.out.println("A páros számok átlaga: " + evenAverage);
			System.out.println("A páratlan számok szorzata: " + oddProduct);
			System.out.println("A páratlan számok gyöke: " + oddRoot);

	}
}
