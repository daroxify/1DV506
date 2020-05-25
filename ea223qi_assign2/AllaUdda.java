package ea223qi_assign2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class AllaUdda {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        System.out.print("The whole array: "); // här går vi igenom hela arrayen
        for (int i = 0; i < 10; i++) {      // för varje position i arrayen
            arr[i] = rand.nextInt(100) + 1; // stoppar vi in ett rand. tal
            System.out.print(arr[i] + " ");     // samt printar ut den
        }
        System.out.println(" ");
        System.out.print("Odd numbers: ");
        for (int value : arr) {
            if (value % 2 != 0) {       // alla jämna tal är delbara på 2,
                System.out.print(value + " "); // annars är de udda
            }
        }
    }

    }
