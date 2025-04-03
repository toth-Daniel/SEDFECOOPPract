public class Metodus2 {

	public static void main(String[] args) {

		int[] theNumbers = new int[10];
		int sum;
		double average;

		Feltolt(theNumbers);
		Kiir(theNumbers);
		sum = Osszeg(theNumbers);
		average = Atlag(theNumbers);

		System.out.printf("\n\nSum: %d\n", sum);
		System.out.printf("Average: %.2f\n", average);
	}

	private static void Feltolt(int[] numbers)
	{
		int[] randomNumbers = numbers;
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (10*Math.random()+1);
		}
	}

	private static void Kiir(int[] numbers)
	{
		System.out.println("Adatok: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	private static int Osszeg(int[] numbers)
	{

		int sum = 0;
		int[] randomNumbers = numbers;

		for (int i = 0; i < randomNumbers.length; i++)
		{
			sum += i;
		}

		return sum;
	}

	private static double Atlag(int[] numbers)
	{
		int average = 0;
		int sum = 0;
		int[] randomNumbers = numbers;

		for (int i = 0; i < randomNumbers.length; i++) {
			sum += i;
		}

		average = sum / randomNumbers.length;

		return sum;
	}
}
