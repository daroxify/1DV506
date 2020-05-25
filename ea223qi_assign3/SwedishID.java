package ea223qi_assign3;

import sun.rmi.server.InactiveGroupException;

import java.util.Date;


public class SwedishID {
    private DateFormat birthday;
    private int checksum;

    public SwedishID(String birthed) {  // skapar birthday i DateFormat
        birthday = new DateFormat(Integer.parseInt(birthed.substring(0, 4)), Integer.parseInt(birthed.substring(4, 6)), Integer.parseInt(birthed.substring(6, 8)), '!', 'b');
        checksum = Integer.parseInt(String.valueOf(Integer.parseInt(birthed.substring(9, 13))));
    }

    public int getChecksum() {
        return checksum;
    }

    public String showID() {     // hämtar getDate och lägger till checksum
        return birthday.getDate(true) + "-" + checksum;
    }

    public boolean isFemale() {      // om det går jämt ut är det en female
        int checker = getChecksum() % 10;
        if (checker % 2 == 0) {
            return true;
        } else return false;
    }

    public int comparedTo(SwedishID otherID) {
        int a = Integer.parseInt(showID().substring(0, 8));         // hämtar 8 första siffrorna i ID
        int b = Integer.parseInt(otherID.showID().substring(0,8));  // hämtar 8 första siffrorn i otherID
        if(a < b){
            return -1;
        } else if (a > b){
            return 1;
        } else return 0;
    }

    public boolean validID(){
        int yearchecker = birthday.getYear() % 1000 % 100 / 10; // här får vi fram 3e siffran i year
        yearchecker = yearchecker * 2;  // den gånger 2
        int lastyear = birthday.getYear() % 10;     // sista siffran i YEAR

        int first = yearchecker / 10;        // får fram första siffran i yearchecker *2;
        int second = yearchecker % 10;       // får fram andra siffran

        int monthchecker = birthday.getMonth();
        int first1 = (monthchecker / 10) * 2;        // får fram första siffran i månad * 2
        int second1 = monthchecker % 10;             // får fram andra siffran i månad

        int daychecker = birthday.getDay();
        int first2 = (daychecker / 10) * 2;           // får fram första siffran i dag *2
        int second2 = daychecker % 10;               // får fram andra siffran i dag

        int sum1checker = (checksum / 1000) * 2;     // första siffran i checksum *2
        int firstsum1 = sum1checker / 10;           // första siffran i sum1checker
        int secondsum1 = sum1checker % 10;          // andra siffran i sum1checker

        int sum2checker = (checksum / 100) % 10;     // andra siffran i checksum

        int sum3checker = (checksum % 1000 % 100 / 10) * 2;  // tredje i checksum *2
        int firstsum3 = (sum3checker / 10);                  // första siffran i sum3checker
        int secondsum3 = (sum3checker % 10);                // andra siffran i sum3checker


        int total = first + second + lastyear + first1 + second1 + first2 + second2 + firstsum1 + secondsum1;
        total = total + sum2checker + firstsum3 + secondsum3; // summan av de allihopa

        int lasttotal = total % 10;             // sista siffran i total;

        int newtotal = 10 - lasttotal;                        // 10 minus den sista siffran i total
        newtotal = newtotal % 10;

        int lastdigit = checksum % 10;
        if (newtotal == lastdigit) {
            return true;
        } else return false;
    }
}
