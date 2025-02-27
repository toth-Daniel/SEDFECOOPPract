package SEDFEC.src.hu.me.sedfec;

import java.util.Scanner;

public class Szavak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Vezetéknév: ");
        String lastName = sc.nextLine();
        System.out.print("Keresztnév");
        String firstName = sc.nextLine();
        System.out.println(lastName + " " + firstName);

    }
}
