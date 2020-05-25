package ea223qi_assign1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main( String[] args ){
        double celcius;
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter the temperature in Fahrenheit");
        double text = scan.nextDouble();
        celcius = (5*(text - 32))/9;
        System.out.print("The corresponding temperature in Celcius is: ");
        System.out.println(celcius);
        scan.close();


    }
}
