package SEDFEC.src.hu.me.sedfec;

public class While1 {
	public static void main(String[] args) {

		int i = 0;
		int evenSum = 0, evenProduct = 1;

		while (i < 10) {
			if (i % 2 == 0) {
				evenSum += i;
			}
			else {
				evenProduct *= i;
			}
			i++;

		}
		System.out.println("Páros számok összege: " + evenSum);
		System.out.println("Páratlan számok szorzata: " + evenProduct);

	}
}
