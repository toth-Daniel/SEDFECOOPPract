package SEDFEC.src.hu.me.sedfec;

public class While {
	public static void main(String[] args) {

		While obj = new While();
		obj.Prog(args);

	}

	public void Prog(String[] args) {
		int number = 1;

		while (number < 21) {
			System.out.println(number);
			number++;
		}
	}
}
