package ea223qi_assign1;

import java.util.Random;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rnd = new Random();
        System.out.println("Do you want to play a game?(Y/N)?");
        char a = scan.next().charAt(0);
        if (a == 'n' || a == 'N') {
            System.out.println("Game ended.");
        }

        if (a == 'y' || a == 'Y') {
            int rnd1 = rnd.nextInt(5) + 1;
            System.out.println("You got " + rnd1);
            int sum = rnd1;

            System.out.println("Do you want to throw the dice again?(Y/N)?");
            char b = scan.next().charAt(0);

            if (b == 'y' || b == 'Y') {                 // Man kan svara med både stort Y och litet y.
                int rnd2 = rnd.nextInt(5) + 1;   // sätter 5+1 för att undvika 0.
                System.out.println("You got: " + rnd2);
                sum = sum + rnd2;
                System.out.println("You have a total: " + sum);

                int rnd3 = rnd.nextInt(5) + 1;
                System.out.println("The computer striked a: " + rnd3);
                int rnd4 = rnd.nextInt(5) + 1;
                int sumd = rnd3 + rnd4;
                System.out.println("The computer striked again and got a: " + rnd4);
                System.out.println("The computer got a total :" + sumd);

                if (sum > 9) {
                    System.out.println("You lost");
                } else if (sum == sumd) {
                    System.out.println("It was a draw.");
                } else if (sumd > 9) {
                    System.out.println("The computer lost");
                } else if (sum > sumd) {
                    System.out.println("You won!!");
                } else if (sum < sumd) {
                    System.out.println("You lost. Try to win by playing again.");
                }
            }


            if (b == 'n' || b == 'N') {
                sum = rnd1;
                System.out.println("You have a total: " + sum);
                int rnd5 = rnd.nextInt(5) + 1;
                System.out.println("The computer striked a: " + rnd5);
                int rnd6 = rnd.nextInt(5) + 1;
                System.out.println("The computer striked again and got a: " + rnd6);
                int sumd2 = rnd5 + rnd6;
                System.out.println("The computer got a total: " + sumd2);


                if (sum > 9) {
                    System.out.println("You lost");
                } else if (sum == sumd2) {
                    System.out.println("It was a draw.");
                } else if (sumd2 > 9) {
                    System.out.println("The computer lost");
                } else if (sum > sumd2) {
                    System.out.println("You won!!");
                } else if (sum < sumd2) {
                    System.out.println("You lost. Try to win by playing again.");
                }


            }


        }
    }
}
