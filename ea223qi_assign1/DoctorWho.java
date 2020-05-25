package ea223qi_assign1;

import java.util.Scanner;

public class DoctorWho {
    public static void main ( String[] args) {
        System.out.println("What year");
        Scanner scan = new Scanner(System.in);
        int text = scan.nextInt();

        if (1962 < text && text < 1970){
            System.out.println("It was the original series!");
        }
        else if (text > 1989 && text < 2006){
            System.out.println("That year it was a break!");
        }
        else if (text > 2004 && text < 2021){
            System.out.println("It was the modern series!");
        }
        else if (text > 2020){
            System.out.println("We don't know, but we can always hope!");
        }
        else if (text < 1963){
            System.out.println("The series didn't exist then.");
        }

    }
}
