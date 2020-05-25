package ea223qi_assign2;

import java.util.Scanner;

public class Losenord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Enter a password: ");
            password = scan.nextLine();

            valid(password);

            if (valid(password)) {      // om allt är rätt
                System.out.println("Password is valid");

            } else if (!valid(password))     // om det saknar något
                System.out.println("Password is not valid");

        } while (!valid(password)); // fortsätter tills vi skriver in rätt
    }

    public static boolean valid(String password) {
        int length = 10;
        int chCount = 0;
        int digCount = 0;
        int uppCount = 0;
        int special = 0;

        if (password.length() < length) {
            return false;       // om lösenordet är mindre än 10 tecken
        } else {                // blir det fel direkt

            for (int i = 0; i < password.length() -1; i++) {
                char c = password.charAt(i); // vi kollar för varje tecken.

                if (Character.isUpperCase(c)) { // är det en stor bokstav?
                    uppCount = uppCount + 1;    // ja- lägg till i räkning
                } else if (Character.isDigit(c)){ // är det en siffra?
                    digCount = digCount +1;
                } else if (Character.isLetter(c)){ // är det en bokstav?
                    chCount = chCount + 1;  // denna måste finnas med för att utesluta
                } else {        // det enda som kan återstå är special-tecken
                    special = special +1;
                }

                }

            if (uppCount >= 2 && digCount >= 2 && special >= 2) {
                return true;
            } else return false;
        }
    }
}
