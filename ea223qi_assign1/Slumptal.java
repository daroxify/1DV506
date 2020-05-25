package ea223qi_assign1;
import java.util.Random;

public class Slumptal {
    public static void main ( String[] args) {
        int sum = 0;
        Random rnd = new Random();

        int rnd1 = rnd.nextInt(100)+1;
        int rnd2 = rnd.nextInt(100)+1;
        int rnd3 = rnd.nextInt(100)+1;
        int rnd4 = rnd.nextInt(100)+1;
        int rnd5 = rnd.nextInt(100)+1;

        System.out.println("Five random numbers: ");
        System.out.println("1 " + rnd1);
        System.out.println("2 " + rnd2);
        System.out.println("3 " + rnd3);
        System.out.println("4 " + rnd4);
        System.out.println("5 " + rnd5);

        System.out.print("The sum is: ");
        sum = rnd1 + rnd2 + rnd3 + rnd4 + rnd5;
        System.out.println(sum);
    }
}
