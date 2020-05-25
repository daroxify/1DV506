package ea223qi_assign2;

import java.util.Arrays;
import java.util.Scanner;

public class Klossar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bredd;
        do {
            System.out.println("Lego Builder");
            System.out.print("Bredd: ");
            bredd = scan.nextInt();
            bredd = (bredd * 2) + 1;
            if (bredd < 0) {
                System.out.println("Hejdå!");
                break;
            }
            System.out.print("Höjd: ");
            int hojd = scan.nextInt();
            hojd = hojd + 2;

            String[][] arr = new String[hojd][bredd];
            builder(bredd, hojd, arr);


            for (int i = 0; i < hojd; i++) {        // printar arrayen vi skapat
                for (int j = 0; j < bredd; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        } while (bredd > 0);
    }

    public static String[][] builder(int bredd, int hojd, String arr[][]){

        arr[0][0] = "┏";              // kanterna har alltid samma pos.
        arr[hojd-1][bredd-1] = "┛";
        arr[0][bredd-1] = "┓";
        arr[hojd-1][0] = "┗";

        for (int i = 1; i < bredd-1; i++) {    // printar övre kanten
            arr[0][i] = "━";
        }
        for (int i = 1; i < hojd-1 ; i++) {     // printar vänsta sidan
            arr[i][0] = "┃";
        }
            for (int j = 1; j < hojd -1 ; j++) {    // printar högra sidan
                arr[j][bredd-1] = "┃";
            }
        for (int i = 1; i <bredd -1 ; i++) {        // printar nedre kanten.
            arr[hojd-1][i]= "━";
        }

        for (int j = 1; j < bredd -1; j++) {       // fyller resten med blankspace
            for (int i = 1; i < hojd -1; i++) {
                arr[i][j] = " ";
            }
        }
        for (int i = 1; i < hojd -1 ; i++) {        // sätta in punkter i deras pos.
            for (int j = 1; j < bredd -1; j=j+2) {
                arr[i][j] = "●";
            }
        }
       // for (int i = 0; i < hojd; i++) {
         //  for (int j = 0; j < bredd ; j++) {

           // }
            //System.out.println();
        //}
         return arr;
    }
}
