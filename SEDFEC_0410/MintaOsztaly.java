public class MintaOsztaly
{
	int firstNumber, secondNumber;

	public MintaOsztaly(int firstNumber, int secondNumber)
	{
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int Sum() {
		return firstNumber + secondNumber;
	}

	public void Output() {
		System.out.println(firstNumber + " + " + secondNumber + " = " + Sum());
	}

//	static int firstNumber, secondNumber;
//
//	public static void setNumber(int first, int second)
//	{
//		firstNumber = first;
//		secondNumber = second;
//	}
//
//	public static int staticSum()
//	{
//		return firstNumber + secondNumber;
//	}
//
//	public static void staticOutput() {
//		System.out.println(firstNumber + " + " + secondNumber + " = " + staticSum());
//	}
}

