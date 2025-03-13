package SEDFEC.src.hu.me.sedfec;

public class Switch {

	public static void main(String[] args) {

		int a, b, result;
		char operator;

		operator = '-';
		a = 5; b = 10;

		switch (operator) {
			case '+':
				result = a + b;
				System.out.println(result);
				break;
			case '-':
				result = a - b;
				System.out.println(result);
				break;
			default:
				System.out.println("Hibás!");
		}

	}
}
