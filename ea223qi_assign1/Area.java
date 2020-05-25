package ea223qi_assign1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float text = 0.0F;
        text = scan.nextFloat();
        float area = (float) (Math.PI * Math.pow(text, 2.0));
        System.out.println("The area of the circle is: ");
        area = (float) Math.round(area*10.0);
        area = area/10;
        System.out.println(area);
        scan.close();

    }
}
