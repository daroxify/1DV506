package ea223qi_assign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileStatistics {
    public static void main(String[] args) {
        int counttotal = 0;
        int countempty = 0;
        int linestext = 0;
        int linespage = 0;

        try {
            File file = new File("C:\\Users\\Enida A\\Downloads\\lovecraft.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                String str = scan.nextLine();
                counttotal++;           // Total Lines
                if (str.isEmpty()) {    // Empty Lines
                    countempty++;
                }
                if(pageNum(str.trim())){ // tror jag får 2 extra eftersom den räknar med båda 11 i början.
                    linespage++;    // därför får jag också två mindre på lines with text.
                }
                if(!str.isEmpty()){         //Lines with text, ej tomma strängar och ej pagenum-strängar
                    if(!pageNum(str.trim())){
                        linestext++;
                    }
                }
            }
            System.out.println("Total Lines: " + counttotal);
            System.out.println("Empty lines: " + countempty);
            System.out.println("Lines with text: " + linestext);
            System.out.println("Lines with page number: " + linespage);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File don't exist");
        }
    }

    public static boolean pageNum(String str){
        try {
            Integer.parseInt(str); // vi testar parsa strängen
        } catch (NumberFormatException e){   // innehåller den endast siffror
            return false;                   // returnerar den true.
        }
        return true;
    }
}
