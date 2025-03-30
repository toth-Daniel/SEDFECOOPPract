package SEDFEC.src.hu.me.sedfec;

public class Tomb1 {
	public static void main(String[] args) {

		int sum = 0;
		double average;

		int[] randomArray = new int[5];
		System.out.println("A tömb elemei: ");

		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int)(Math.random()*10+1);
			System.out.print(randomArray[i] + " ");
		}

		for (int i = 0; i < randomArray.length; i++) {
			sum += randomArray[i];
		}

		average = (double) sum / randomArray.length;

		System.out.println("A tömb elemeinek átlaga: " + average);
		System.out.println("A tömb elemeinek összege: " + sum);
	}
}
