package ea223qi_assign4;

import java.util.Scanner;

public class SafeDateMain {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DateFormat2 birth = new DateFormat2();

        do {
            try {
                System.out.println("Give me a year: ");
                int year1 = scan.nextInt();
                if(year1 == 0){ // om vi skriver in 0 avslutar vi
                    System.out.println("Bye bye");
                    break;
                }

                System.out.println("Give me a month: ");
                int month1 = scan.nextInt();
                System.out.println("Give me a day: ");
                int day1 = scan.nextInt();



                birth.setYear(year1);   // vi sätter värdena till det vi skrivit in
                birth.setMonth(month1);
                birth.setDay(day1);
                birth.setFormat('l');
                birth.setPunctuation('/');

                System.out.println( "The date is: " + birth.getDate(true));
            } catch (IllegalArgumentException e) {
                System.out.println("That is not possible, error is:" + e.getMessage());
            }
        } while (true);
        scan.close();
    }
}
