package ea223qi_assign1;

import java.util.Scanner;

public class Tal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First number: ");
        int first = scan.nextInt();
        System.out.println("Second number: ");
        int second = scan.nextInt();
        System.out.println("Third number: ");
        int third = scan.nextInt();

        if (first > second && second > third) {
            System.out.println(third);
            System.out.println(second);
            System.out.println(first);

        } else if (second > first && first > third) {
            System.out.println(third);
            System.out.println(first);
            System.out.println(second);

        } else if (second > third && third > first) {
            System.out.println(first);
            System.out.println(third);
            System.out.println(second);
        }
        else if (first < second && second < third){
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
        }
        else if (first > third && third > second){
            System.out.println(second);
            System.out.println(third);
            System.out.println(first);
        }
        else if (first > second && third > first){
            System.out.println(second);
            System.out.println(first);
            System.out.println(third);
        }
    }
}
