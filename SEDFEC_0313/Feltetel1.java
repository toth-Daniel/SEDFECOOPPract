package SEDFEC.src.hu.me.sedfec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Feltetel1 {

    public static void main(String[] args) throws IOException {

        int number;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Adj meg egy egész számot: ");

        number = Integer.valueOf(br.readLine()).intValue();

        if (number % 2 == 0)
            System.out.println("Páros szám: " + number);
        else
            System.out.println("Páratlan szám: " + number);

        if (number < 100)
            System.out.println("Kisebb, mint 100: " + number);
        else
            System.out.println("Nagyobb, mint 100" + number);
    }
}
