package ea223qi_assign2;

import java.util.Scanner;

public class RaknaNummer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        int value;
        do {
            System.out.print("Enter a number: ");
            value = scan.nextInt();
            sum = sum + value;      // för varje tal ökar vi summan
        } while (value != 0);       // vi frågar användaren efter nummer tills hen skriver 0
        System.out.println("The sum is: " + sum);   // när användaren skrivit in 0
        }                                           // printar vi summan
    }
