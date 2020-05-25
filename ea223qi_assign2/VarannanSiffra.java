package ea223qi_assign2;

import java.util.Scanner;

public class VarannanSiffra {
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        int first = scan.nextInt();
        System.out.println("Second number: ");
        int second = scan.nextInt();

        for (int i = first; i < second; i= i+2) {
            System.out.print(" " + i);

        }

    }
}
