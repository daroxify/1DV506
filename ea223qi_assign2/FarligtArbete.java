package ea223qi_assign2;

import java.util.Scanner;

public class FarligtArbete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you want to earn?");
        int earn = scan.nextInt();
        float money = (float) 0.01;     // float - decimaltal
        int days = 0;
        while (money < earn){
            money = money * 2;          //pengarna fördubblas för
            days++;                      //varje dag som ökar
        }
        System.out.println("You will have the money in "+ days + " days");

    }
}