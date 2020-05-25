package ea223qi_assign2;

import java.util.Random;

public class Histogram {
    public static void main(String[] args) {
        Random rnd = new Random();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0; // antal av varje kast

        for (int i = 0; i < 500; i++) { // 500 kast
            int rand = rnd.nextInt(6) +1; // undviker 0an

            if (rand == 1) {
                one++;
            } else if (rand == 2) {
                two++;
            } else if (rand == 3) {
                three++;
            } else if (rand == 4) {
                four++;
            } else if (rand == 5) {
                five++;
            } else if (rand == 6) {     // här sorterar vi in kasten.
                six++;
            }
        }
        System.out.print("Ettor (" + one + "): ");
        for (int i = 0; i < one; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("Tvåor (" + two + "): ");

        for (int i = 0; i < two ; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("Treor (" + three + "): ");
        for (int i = 0; i < three; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("Fyror (" + four + "): ");
        for (int i = 0; i < four; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("Femmor (" + five + "): ");
        for (int i = 0; i < five ; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("Sexor (" + six + "): ");
        for (int i = 0; i < six; i++) {
            System.out.print("*");
        }
        }
    }
