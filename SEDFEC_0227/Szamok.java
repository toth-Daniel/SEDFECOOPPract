package SEDFEC.src.hu.me.sedfec;

import java.util.Scanner;
import java.io.*;

public class Szamok {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("A: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("B: ");
        int b = Integer.parseInt(br.readLine());
        int c = a + b;
        System.out.print("A két szám összege: " + c);
    }
}
