package ea223qi_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ObscureLovecraft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("\n Obscure" + "\n ========");
                System.out.println("1. Make obscure \n2. Make readable");
                System.out.println("3. Print obscure \n4. Print readable");
                System.out.println("0. Exit \n===>" );
                int a = scan.nextInt();

                if (a == 1) {   // beroende på vad vi skriver in,
                    obscure();  // kallar vi på de olika metoderna
                } else if (a == 2) {
                    readAble();
                } else if (a == 3) {
                    printer1();
                } else if (a == 4) {
                    printer();
                    System.out.println();
                } else if (a == 0) {
                    System.out.println("Bye bye!"); // vi avslutar om vi väljer 0
                    break;
                }
            } catch (InputMismatchException e) {    // om vi skriver in något annat än en int
                System.out.println("That is not an option");
                scan.nextLine();            // rensar scan så vi kan börja om
            }
        } while (true);
        scan.close();
    }

    public static void obscure() {      // skapar en krypterad kopia
        File file = new File("C:\\Users\\Enida A\\Downloads\\lovecraft.txt");
        File newFile = new File("C:\\Users\\Enida A\\Downloads\\obscure.txt");
        try {
            if (fileExists(file)) {     // om filen existerar
                Scanner scan = new Scanner(file);
                PrintWriter printer = new PrintWriter(newFile);
                while (scan.hasNext()) {
                    String s = scan.nextLine();
                    if (!s.isEmpty()) {
                        for (int i = 0; i < s.length(); i++) {
                            char c = s.charAt(i);

                            int ascicode = (int) c;     // vi gör om bokstaven
                            char thirdChar = (char) (ascicode + 3);
                            printer.print(thirdChar);       // och lägger in den i vår nya fil

                        if (i == s.length() - 1) {      // om det är i slutet av en sträng, radbrytning
                            printer.println();
                        }
                    }
                }
                if (s.isEmpty()) {
                    printer.print("\n");      // om det är en tom rad, lägger vi till en tom rad
                }
            }
                System.out.println("\n Done!");
            scan.close();
            printer.close();
        }
    }catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
    }

}

    public static void readAble() {     // gör om den krypterade till "läsningsbar"
        try {
            File file = new File("C:\\Users\\Enida A\\Downloads\\obscure.txt");
            File anotherFile = new File("C:\\Users\\Enida A\\Downloads\\readableLovecraft.txt");
            if (fileExists(file)) {          // kollar så bägge filerna existerar
                Scanner scan = new Scanner(file);
                PrintWriter printer = new PrintWriter(anotherFile);
                while (scan.hasNext()) {
                    String s = scan.nextLine();
                    if (!s.isEmpty()) {
                        for (int i = 0; i < s.length(); i++) {
                            char a = s.charAt(i);
                                int ascii = (int) a;
                                char thirdChar = (char) (ascii - 3);    // ändrar tillbaka bokstaven
                                printer.print(thirdChar);
                            if (i == s.length() - 1) {
                                printer.println();
                            }
                        }
                    }
                    if (s.isEmpty()) {
                        printer.print("\n");
                    }
                }
                System.out.println("\n Done!");
                scan.close();
                printer.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printer() {      // denna metoden printar den nya filen som är läsningsbar som vi skapat
        try {
            File file = new File("C:\\Users\\Enida A\\Downloads\\readableLovecraft.txt");
            if (fileExists(file)) { // kollar om filen readableLovecraft existerar
                Scanner scan = new Scanner(file);
                while (scan.hasNext()) {
                    String str = scan.nextLine();
                    if (!str.isEmpty())
                        System.out.print(str);
                    else {
                        System.out.print("\n");
                    }
                    System.out.println("");
                }
                System.out.println("\n Done!");
                scan.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printer1() {      // denna metoden printar den krypterade
        try {
            File file = new File("C:\\Users\\Enida A\\Downloads\\obscure.txt");
            if (fileExists(file)) {  // kollar om filen obscure existerar
                Scanner scan = new Scanner(file);
                while (scan.hasNext()) {
                    String str = scan.nextLine();
                    if (!str.isEmpty()) {
                        System.out.print(str);
                    } else {
                        System.out.println("\n");
                    }
                }
                scan.close();
            }
            System.out.println("\n Done!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean fileExists(File file) throws FileNotFoundException {
        if (file.exists()) {            // kollar så filen existerar
            return true;
        } else throw new FileNotFoundException("File does not exist yet");
    }
}
