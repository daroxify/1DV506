package ea223qi_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// anledningen till att jag får annorlunda värden än vad som står i labbhäftet
// kan bero på att jag tar bort alla möjliga specialtecken.

public class CheckingWords {
    public static void main(String[] args){
        ArrayList<String> arrOfEach = new ArrayList<>();    // arraylist där vi sparar alla ord unika vi stött på
        arrOfEach.add("cthulhu");       // lägger till de "begärda" orden
        arrOfEach.add("azathoth");
        arrOfEach.add("necronomicon");
        ArrayList<Integer> sumOfEach = new ArrayList<>();   // arrayList där vi sparar alla ords occurrances
        sumOfEach.add(0);               // ger de "begärda" orden värdet 0
        sumOfEach.add(0);
        sumOfEach.add(0);
        try {
            File file = new File("C:\\Users\\Enida A\\Downloads\\lovecraft.txt");
            if (file.exists()) {        // kollar så att filen finns
                Scanner scan = new Scanner(file);
                int count = 0;
                System.out.println("Analysing text...");

                while (scan.hasNext()) {
                    String s = scan.next().toLowerCase();
                    count++;        // räknar antal ord totalt
                    s = removeDots(s);

                    if (count % 50000 == 0) {       // skriver ut vilket ord vi är på så vi vet att något händer
                        System.out.println("Now at: " + count);
                    }

                    for (int i = 0; i < arrOfEach.size(); i++) {
                        if (s.equals(arrOfEach.get(i))) {   // vi jämför ordet vi scannar in med vår arrayList där
                            int n = sumOfEach.get(i);       // vi sparar alla ord vi stött på.
                            n++;
                            sumOfEach.remove(i);        // tar bort nuvarande värde på occurrances
                            sumOfEach.add(i, n);        // lägger till på samma pos, men med ett nytt värde
                            break;
                        } else if (i == arrOfEach.size() - 1) {     // om inte ordet finns i vår arrayList
                            arrOfEach.add(s);                       // lägger vi till det och ger den värdet 1
                            sumOfEach.add(1);
                        }
                    }
                }
                scan.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        int max = 0;
        int nestMax = 0;
        int posMax = 0;
        int posNextMax = 0;

        for (int i = 0; i < sumOfEach.size(); i++) {
            if (sumOfEach.get(i) > max) {// Här kollar vi vilket ord som har upprepats flest gånger
                nestMax = max;
                max = sumOfEach.get(i);
                posMax = i;         // sparar vilken position det ordet finns på
            } else if (sumOfEach.get(i) < max && sumOfEach.get(i) > nestMax) {  // här kollar vi vilket ord
                nestMax = sumOfEach.get(i);         // som har upprepats näst flest gånger
                posNextMax = i;
            }
        }
        System.out.println("Most common word: " + arrOfEach.get(posMax) + " with " + max + " occurrences.");
        System.out.println("Second most common word: " + arrOfEach.get(posNextMax) + " with " + nestMax + " occurrences.");
        System.out.println("Occurrences of \"" + arrOfEach.get(0) + "\": " + sumOfEach.get(0));
        System.out.println("Occurrences of \"" + arrOfEach.get(1) + "\": " + sumOfEach.get(1));
        System.out.println("Occurrences of \"" + arrOfEach.get(2) + "\": " + sumOfEach.get(2));
    }

    public static String removeDots(String word) { // vi tar bort alla specialtecken som är möjliga
        word = word.replace(".", "");
        word = word.replace(",", "");
        word = word.replace("?", "");
        word = word.replace(":", "");
        word = word.replace(";", "");
        word = word.replace("-", "");
        word = word.replace("(", "");
        word = word.replace(")", "");
        word = word.replace("&", "");
        word = word.replace("'", "");
        word = word.replace("!", "");
        word = word.replace("°", "");
        word = word.replace("/", "");
        word = word.replace("\"", "");
        word = word.replace("#", "");
        word = word.replace("_", "");
        word = word.replace("+", "");
        return word;
    }
}