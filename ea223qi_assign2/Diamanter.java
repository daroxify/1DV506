package ea223qi_assign2;

import java.util.Scanner;

public class Diamanter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value;

        do {
            System.out.println("Enter a positive number: ");
            value = scan.nextInt();
            for (int i = 1; i < value *2; i = i+2) {
                for (int k = 0; k < (value - (i / 2)); k++) {
                    System.out.print(" ");          // fick testa mig fram vilka värden som funkade
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println(""); // allt ovanför är första halvan av diamanten
            }
            for (int l = value*2; l > 0  ; l = l-2) { // i denna delen flippar jag bara de övre for-satserna
                for (int m = -2; m < ( value - (l / 2)) ; m++) {
                    System.out.print(" ");
                }
                for (int n = l -3; n > 0 ; n--) {
                    System.out.print("*");
                }
                System.out.println("");
                }
        } while (value > 0);
        System.out.println("This was a negative number");
    }
}