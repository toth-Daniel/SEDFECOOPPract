package SEDFEC.src.hu.me.sedfec;

import java.util.Scanner;

public class Olvas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy tört számot: ");
        double d = sc.nextDouble();
        System.out.print("Adj meg egy egész számot: ");
        int i = sc.nextInt();

        System.out.println("Az egész szám: " + i);
        System.out.println("A lebegőpontos szám: " + d);
    }
}
