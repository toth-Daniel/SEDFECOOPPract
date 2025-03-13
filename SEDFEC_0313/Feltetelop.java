package SEDFEC.src.hu.me.sedfec;

public class Feltetelop {

    public static void main(String[] args) {

        int x = 12;
        int y = 2;
        int min, max;

        min = x < y ? x : y;
        max = x > y ? x : y;

        System.out.println("Legkisebb (min) = " + min);
        System.out.println("Legkisebb (max) = " + max);

    }
}
