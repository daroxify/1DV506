package ea223qi_assign2;

import java.util.Scanner;

public class EnkelTriangel {
    public static void main(String[] args) {
        int number;
        do{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        number = scan.nextInt();

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < i ; j++) {
                    System.out.print(" ");
                }
                for (int k = number; k > i; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }

            } while (number > 0);
        System.out.println("Number must be positive");

        }
    }


