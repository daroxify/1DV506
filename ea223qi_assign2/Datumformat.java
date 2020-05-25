package ea223qi_assign2;

import java.util.Scanner;

public class Datumformat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv ett år: ");
        int year = scan.nextInt();
        System.out.print("Skriv en månad (nummer): ");
        int month = scan.nextInt();
        System.out.print("Skriv en dag (nummer): ");
        int day = scan.nextInt();

        System.out.print("Ange format (b/l/m): ");

        char form = scan.next().charAt(0);
        print(form, year, day, month);

        System.out.println((print(form, year, day, month)));

    }


    public static String print(int form, int year, int day, int month) {
        String date = "";

        if (form == 'b') {
            if (month < 10 && day < 10){
                date = year + "/0" + month + "/0" + day;
            } else if (month < 10 && day > 10) { // om månaden vi skriver in är 1-9, ska det stå en 0a framför månaden
                date = year + "/0" + month + "/" + day;
            } else if (day < 10 && month > 10){
                date = year + "/" + month + "/0" + day;
            } else {
                date = year + "/" + month + "/" + day;
            }return date;
        }
          if (form == 'l') {
              if (month < 10 && day < 10){
                  date = "0" + day + "/0" + month + "/" + year;
              } else if (month < 10 && day > 10) {
                  date = day + "/0" + month + "/" + year;
              } else if (day < 10 && month > 10) {
                  date = "0" + day + "/" + month + "/" + year;
              } else {
                  date = day + "/" + month + "/" + year;
              } return date;
          }
                if (form == 'm') {
                    if (month < 10 && day < 10){
                        date = "0" + month + "/0" + day + "/" + year;
                    } else if (month < 10 && day > 10){
                        date = "0" + month + "/" + day + "/" + year;
                    } else if (month > 10 && day < 10){
                        date = month + "/0" + day + "/" +  year;
                    } else
                        date = month + "/" + day + "/" + year;
                } return date;
            }
        }


