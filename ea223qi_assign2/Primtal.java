package ea223qi_assign2;

import java.util.Scanner;

public class Primtal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            if (num < 0){
                System.out.println("Number must be positive");
            }
            else if (checkIfPrime(num)){
                System.out.println("The number is a prime number!");
            }else System.out.println("The number is not a prime number");

        } while (num > -1); // vi sätter större än -1 eftersom 0 inte är ett primtal.
                            // och inte heller negativt
    }


    public static boolean checkIfPrime(int num){
        if (num == 1 || num == 0){ // 1 och 0 är inga primtal, automatiskt falskt.
            return false;
        }

        for (int i = 2; i < num ; i++) { // vi startar på två och gör en beräkning mha
            if (num % i == 0)           // modulus.
                return false;           // om det går jämt ut är det inte ett primtal
        }                               // då ett primtal endast går jämt ut när
        return true;                    // det delas på 1 och sig självt.
    }

}

