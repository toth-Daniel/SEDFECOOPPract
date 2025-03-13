package SEDFEC.src.hu.me.sedfec;

import java.util.Scanner;

public class Feltetel6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        if (number <=50) {
            System.out.println("Pontszám: " + number);
            System.out.print("Érdemjegy: " + 1);
        }
        else if (51 <= number && number < 61) {
            System.out.println("Pontszám: " + number);
            System.out.println(("Érdemjegy: " + 2));
        }
        else if (61 <= number && number < 71) {
            System.out.println("Pontszám: " + number);
            System.out.println("Érdemjegy: " + 3);
        }
        else if (71 <= number && number < 81) {
            System.out.println("Pontszám: " + number);
            System.out.println("Érdemjegy: " + 4);
        }
        else if (82 <= number && number < 101) {
            System.out.println("Pontszám: " + number);
            System.out.println("Érdemjegy: " + 5);
        }

	}
}
