package ea223qi_assign2;

import java.util.Scanner;

public class NastStorsta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in 10 heltal: ");
        int highest = 0;
        int secondHighest = 0;

        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();

            if (num > highest){
                secondHighest = highest;
                highest = num;

            }
            else if (num < highest && num > secondHighest){
                secondHighest = num;

            }
        } System.out.println(secondHighest + " is the second highest");

    }

}


