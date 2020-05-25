package ea223qi_assign1;

import java.util.Scanner;

public class Tid {
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time in seconds: ");
        int sek = scan.nextInt();
        int tim = sek / 3600;
        int min = sek/60 % 60;
        sek = sek % 60;

        System.out.print("It corresponds: " + tim + " hours "
                         +  min + " minutes and " + sek + " seconds " );



    }
}
