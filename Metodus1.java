public class Metodus1
{
	public static void main(String[] args)
	{
		final int db = 10;

		int smallest, biggest;
		int[] numbers = new int[db];

		for (int i = 0; i < db; i++) {
			numbers[i] = (int)(10*Math.random()+1);
		}

		Kiir(numbers);
		smallest = SmallestFind(numbers);
		biggest = BiggestFind(numbers);

		System.out.printf("\nSmallest: %d\n", smallest);
		System.out.printf("Biggest: %d\n", biggest);
	}

	private static int BiggestFind(int[] numbers) {
		int biggest_number = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (biggest_number > numbers[i]) {
				biggest_number = numbers[i];
			}
		}

		return biggest_number;
	}

	private static int SmallestFind(int[] numbers) {
		int smallest_number = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (smallest_number < numbers[i]) {
				smallest_number = numbers[i];
			}
		}

		return smallest_number;
	}

	private static void Kiir(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%d ", numbers[i]);
		}
	}
}
