package ea223qi_assign1;

import java.util.Scanner;

public class Avstand {
    public static void main ( String[] args) {
        System.out.println("Enter the value of x1 : ");
        Scanner valuex1 = new Scanner(System.in);
        int x1 = valuex1.nextInt();
        System.out.println("Enter the value of y1: ");
        Scanner valuey1 = new Scanner(System.in);
        int y1 = valuey1.nextInt();
        System.out.println("Enter the value of x2: ");
        Scanner valuex2 = new Scanner(System.in);
        int x2 = valuex2.nextInt();
        System.out.println("Enter the value of y2: ");
        Scanner valuey2 = new Scanner(System.in);
        int y2 = valuey2.nextInt();

        int deltaX = x2 - x1; // Delta x, lättare att skriva in i Math.sqrt
        int deltaY = y2 - y1; // Delta y, lättare att skriva in i Math.sqrt

        float sqrof = (float) Math.sqrt((Math.pow(deltaX, 2.0)) + (Math.pow(deltaY, 2.0)));
        sqrof = Math.round(sqrof * 1000);
        sqrof = sqrof /1000;


        System.out.println("Avståndet är: " + sqrof);









    }
}
