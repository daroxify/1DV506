package ea223qi_assign2;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Veckans lottorad: ");
        while (arr.size()< 7){          // sålänge arr.size är mindre än 7
            int num = rand.nextInt(34) + 1; // fyller vi den med tal
            if (arr.contains(num)) {            // om arrayen redan innehåller
                // do nothing                   //talet, gör vi inget
            } else {                            // annars stoppar vi in talet
                arr.add(num);                   // och sorterar arrayen
                Collections.sort(arr);
            }
        }
        System.out.println(arr);

    }
}

