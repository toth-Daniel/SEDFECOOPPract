package SEDFEC.src.hu.me.sedfec;

public class Tomb20 {
	public static void main(String[] args) {

		char[] exes = new char[20];

		for (int i = 0; i < 20; i++) {
			exes[i] = 'X';
		}

		for (int i = 0; i < 20; i+=2) {
			exes[i] = 'Y';
		}

		for (int i = 0; i < 20; i++) {
			System.out.print(exes[i]);
		}
	}
}
