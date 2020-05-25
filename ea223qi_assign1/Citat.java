package ea223qi_assign1;

import java.util.Scanner;

public class Citat {
    public static void main ( String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println ("Give me something to quote!");
    String text = scan.nextLine();
        System.out.print("You said: ");
        System.out.println("\"" + text + "\"");
        scan.close();
    }
}
