package ea223qi_assign1;

import java.util.Scanner;

public class Vindavkylning {
    public static void main ( String[] args) {
        System.out.println("How many degrees Celsius is is outside? ");
        Scanner scantemp = new Scanner(System.in);
        double temp = scantemp.nextDouble();

        System.out.println("What is the wind-speed outside in m/s? ");
        Scanner scanwind = new Scanner(System.in);
        double wind = scanwind.nextDouble();

        double conwind = wind * 3.6;

        double T = 13.12 + (0.6215*temp) - (11.37 * (Math.pow(conwind, 0.16))) + (0.3965 * temp)*(Math.pow(conwind, 0.16));
        double t = Math.round(T);

        System.out.println("Experienced temperature:" + t);




    }
}
