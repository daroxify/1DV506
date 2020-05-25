package ea223qi_assign4;

import java.io.*;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Enida A\\Downloads\\lovecraft.txt");
            if (file.exists()) {        // kollar så att filen finns
                Scanner scan = new Scanner(file);
                int count = 0;

                while (scan.hasNext()) {
                    String s = scan.nextLine();
                    String[] arrOfStr = s.split(" "); //Vi skapar en array med av strängen
                    if (!s.isEmpty()) {     // om det inte är en tomrad
                        if (!pageNum(s.trim())){      // och om det inte är pagenum
                            for (int i = 0; i < arrOfStr.length; i++) { // räknar ord i arrayen
                                count++;
                            }
                        }
                    }
                }
                scan.close();
                System.out.println("Number of words: " + count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean pageNum(String s) {  // kollar om det är pagenum.
            try {
                Integer.parseInt(s); // vi testar parsa strängen
            } catch (NumberFormatException e){   // innehåller den endast siffror
                return false;                   // returnerar den true. annars false
            }
            return true;
        }
}