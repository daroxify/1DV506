package ea223qi_assign1;

import java.util.Arrays;
import java.util.Scanner;

public class Programmeringssprak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first language?");
        String first = scan.nextLine();
        System.out.println("What is the second language?");
        String second = scan.nextLine();
        System.out.println("What is the third language?");
        String third = scan.nextLine();

        String a[] = {first, second, third};
        Arrays.sort(a);

        System.out.print("Alphabetical order is: ");
        for (String b : a) {
            System.out.print(b + "  ");
        }



    }
}