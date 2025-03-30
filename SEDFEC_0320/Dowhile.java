package SEDFEC.src.hu.me.sedfec;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a whole, positive number: ");
		int number = sc.nextInt();

		int i = 1;
		boolean isPrime = true;

		System.out.println("A(z) " + number + " osztói: ");

		do {
			if (number % i == 0) {
				System.out.print(i + " ");
				if (i != 1 && i != number) {
					isPrime = false;
				}
			}
			i++;
		} while (i <= number);

		System.out.println();
		System.out.println("A(z) " + number + (isPrime ? " egy prímszám." : " nem prímszám."));

		sc.close();

	}
}
