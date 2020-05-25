package ea223qi_assign2;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = "";

        do {
            System.out.println("Enter a word och sentence to check if it is a palindrome: ");
            line = scan.nextLine();
            if (line.equals("stopp"))
                break; // vi slutar så fort vi skriver stopp

            controller(line);

            if (controller(line)) {
                System.out.println("This is a palindrome");
            } else System.out.println("This is not a palindrome");

        } while (true); // eftersom vi avslutar så fort vi skriver stopp ovan
    }                   // ville programmet ändra till det här

    public static boolean controller(String line) {
        String backwards = "";      // skapar tom sträng
        String newsent = "";        // skapar tom sträng

            String smallabc = line.toLowerCase(); // omvandlar alla till små bokstäver
                                                // för T och t är inte "samma"

            for (int i = 0; i < line.length(); i++) {
                char bokstav = smallabc.charAt(i); // gör varje bokstav i strängen till en char

                if (Character.isLetter(bokstav)) {   // kollar om det är en bokstav och inte en siffra/tecken
                    newsent = newsent + smallabc.charAt(i); // vi skapar en ny mening
                }                                           // som innehåller char och endast
            }                                               // små bokstäver, inga mellanslag.

            for (int j = newsent.length() - 1; j >= 0; j--) { // vi börjar sist på den nya
                backwards = backwards + newsent.charAt(j);     // meningen och lägger till varje
            }                                                  //bokstav i backwards

            if (newsent.equals(backwards)){ // om den nya meningen är lika som den baklänges
                return true;                // returnera true (palindrom)
            } else return false;
        }
    }