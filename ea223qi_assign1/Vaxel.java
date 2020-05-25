package ea223qi_assign1;

import java.util.Scanner;

public class Vaxel {
    public static void main ( String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Price: ");
        int left, left1, left2, left3, left4, left5, left6, left7, left8;
        double price = scan.nextDouble();
        System.out.println("Payment: ");
        double payment = scan.nextDouble();

        int change = (int) (payment - price + 0.5);

        System.out.println("Change: " + change);
        int thousand = change / 1000; // antal tusenlappar
        left = change %1000; //vad vi får kvar efter tusenlapparna

        int fivehundred = left/500; // antal femhundringar
        left1 = left%500; // vad vi får kvar efter femhundringarna

        int twohundred = left1/200; // antal tvåhundringar
        left2 = left1%200; // vad vi får kvar efter tvåhundringarna

        int hundred = left2/100; // antal hundringar
        left3 = left2 %100; // vad vi får kvar efter hundringarna

        int fifty = left3/50; // antal femtiolappar
        left4 = left3%50; // vad vi får kvar efter femtiolapparna

        int twenty = left4/20;
        left5 = left4%20;

        int ten = left5 /10;
        left6 = left5%10;

        int five = left6/5;
        left7 = left6%5;

        int two = left7/2;
        left8 = left7%2;

        int one = left8;

        System.out.println("1000 kr-bills: " + thousand);

        System.out.println("500 kr-bills: " + fivehundred);

        System.out.println("200 kr-bills: " + twohundred);

        System.out.println("100 kr-bills: " + hundred);

        System.out.println("50 kr-bills: " + fifty);

        System.out.println("20 kr-bills: " + twenty);

        System.out.println("10 kr-coins: " + ten);

        System.out.println("5 kr-coins: " + five);

        System.out.println("2 kr-coins: " + two);

        System.out.println("1 kr-coins: " + one);


    }
}
