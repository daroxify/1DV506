package ea223qi_assign4;

public class DateFormat2 {
    int year, month, day;
    char punctuation, form;
    String printer = "";


    public DateFormat2() {

    }

    public DateFormat2(int year, int month, int day, char punctuation, char form) {
        setYear(year);
        setMonth(month);
        setDay(day);
        setFormat(form);
        setPunctuation(punctuation);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getFormat() {
        return form;
    }

    public void setFormat(char form) {
        this.form = form;
    }

    public char getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(char punctuation) {
        this.punctuation = punctuation;
    }

    public String getDate(boolean fullYear) { // DENNA FUNKAR BOOLEAN
        if ( day < 1 || day > 31) {         // lägger in olika krav
            //printer = "Invalid date";
            throw new IllegalArgumentException("Not a valid day that month");
            //return printer;
        }
        else if (month < 1 || month > 12) {
            //printer = "Invalid date";
            throw new IllegalArgumentException("Month must be between 1&12");
            //return printer;
        }
        else if (year < 1900 || year > 2100) {      // Accepterar endast datum mellan dessa åren
            printer = "Invalid date";
            //printer = "Bye bye";
            return printer;
        }
        else if (year == 1900||year == 2100){      // dessa år är jämt delbart med 4, men inga skottår
            if(day > 28){
                throw new IllegalArgumentException("Not a valid day that month");
               // printer = "Invalid date";
               // return printer;
            }
        }
        else if (year % 4 != 0 && month == 2 && day > 28) { // om det inte är skottår och dag >28
            throw new IllegalArgumentException("Not a valid day that month");
            //printer = "Invalid date";
            //return printer;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11){ // månader med 30 dagar
            if( day > 30){
                throw new IllegalArgumentException("Not a valid day that month");
                //printer = "Invalid date";
                //return printer;
            }
        }
        else if (year % 4 == 0 && month == 2 && day > 29){  // om det är skottår men dag > 29
            throw new IllegalArgumentException("Not a valid day that month");
            //printer = "Invalid date";
            //return printer;
        }

        if (!fullYear){         // om det inte ska vara fullyear, ändrar vi
            year = getYear() % 1000;
            year = year % 100;
        }
        if (getFormat() == 'b') {       // olika prints beroende på format och punctutation
            if (punctuation == '!' && day < 10 && month < 10) {
                printer = getYear() + "0" + getMonth() + "0" + getDay();
            } else if (punctuation == '!' && day < 10) {
                printer = getYear() + String.valueOf(getMonth()) + "0" + getDay();
            } else if (punctuation == '!' && month < 10) {
                printer = getYear() + "0" + getMonth() + getDay();
            } else if(punctuation == '!'){
                printer = getYear() + String.valueOf(getMonth()) + getDay();
            } else if ( month < 10 && day < 10) {
                printer = getYear() + String.valueOf(getPunctuation()) + "0" + getMonth() + getPunctuation() + "0" + getDay();
            } else if (month < 10) {
                printer = getYear() + String.valueOf(getPunctuation()) + "0" + getMonth() + getPunctuation() + getDay();
            } else if (day < 10){
                printer = getYear() + String.valueOf(getPunctuation()) + getMonth() + getPunctuation() + "0" + getDay();
            } else printer = getYear() + String.valueOf(getPunctuation()) + getMonth() + String.valueOf(getPunctuation()) + getDay();
        }

        else if (getFormat() == 'l') {
            if(punctuation == '!' && day < 10 && month < 10) {
                printer = "0" + getDay() + "0" + getMonth() + getYear();
            } else if (punctuation == '!' && day < 10) {
                printer = "0" + getDay() + getMonth() + getYear();
            } else if (punctuation == '!' && month < 10) {
                printer = getDay() + "0" + getMonth() + getYear();
            } else if (month < 10 && day < 10) {
                printer = "0" + getDay() + getPunctuation() + "0" + getMonth() + getPunctuation() + getYear();
            } else if (month < 10) {
                printer = String.valueOf(getDay()) + getPunctuation() + "0" + getMonth() + getPunctuation() + getYear();
            } else if (day < 10){
                printer = "0" + getDay() + getPunctuation() + getMonth() + getPunctuation() + getYear();
            } else printer = (getDay() + String.valueOf(getPunctuation()) + getMonth() + String.valueOf(getPunctuation()) + getYear());

        } else if (getFormat() == 'm') {
            if(punctuation == '!' && day < 10 && month < 10) {
                printer = "0" + getMonth() + "0" + getDay() + getYear();
            } else if (punctuation == '!' && day < 10) {
                printer = getMonth() + "0" + getDay() + getYear();
            } else if (punctuation == '!' && month < 10) {
                printer = "0" + getMonth() + getDay() + getYear();
            } else if (month < 10 && day < 10) {
                printer = "0" + getMonth() + getPunctuation() + "0" + getDay() + getPunctuation() + getYear();
            } else if (month < 10) {
                printer = "0" + getMonth() + getPunctuation() + getDay() + getPunctuation() + getYear();
            } else if (day < 10 ){
                printer = getMonth() + getPunctuation() + "0" + getDay() + getPunctuation() + getYear();
            } else printer = getMonth() + getPunctuation() + String.valueOf(getDay()) + getPunctuation() + getYear();
        }

        return printer;
    }
}
