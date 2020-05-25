package ea223qi_assign1;

import java.util.Scanner;

public class SummanAvTre {
    public static void main ( String[] args) {
        int first, second, third;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        int text = scan.nextInt();

        //find first digit
        first = text / 100;

        // find second digit
        second = text / 10;
        second = second % 10;

        //find third digit
        third = text % 100;
        third = third % 10;

        sum = first + second + third;
        System.out.println("The sum of the numbers is: "+ sum);




        
    }
}
