package SEDFEC.src.hu.me.sedfec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Feltetel3 {

	public static void main(String[] args) {

		int points;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter number: ");
			points = Integer.valueOf(br.readLine()).intValue();

			if (points >= 0 && points <= 100) {
				int grade = (points < 51) ? 1 : (points < 61) ? 2 : (points < 71) ? 3 : (points < 81) ? 4 : 5;
				System.out.println("Érdemjegy: " + grade);
			}
			else {
				System.out.println("Hibás adat! A pontszámnak 0 és 100 között kell lennie!");
			}
		} catch (NumberFormatException | IOException e) {
			System.out.println("Hibás adat! Adj meg egy érvényes számot!");
		}

	}
}
