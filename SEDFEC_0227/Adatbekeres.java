package SEDFEC.src.hu.me.sedfec;

import java.util.Scanner;

public class Adatbekeres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("A bekért szám duplája: " + a * 2);

    }

}
