package ea223qi_assign2;


import java.util.Random;

public class Myran {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Myror");
        System.out.println("=====" + "\n");


        float sum = 0;
        for (int k = 1; k < 11; k++) {
        int[][] a = new int[8][8];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 0;                // sätt alla pos i arrayen till 0;
            }
        }
            int x = rand.nextInt(8);
            int y = rand.nextInt(8);        // slumpa en plats vart myran ska starta.
            a[x][y] = 1;                          // x = ner/ upp y = höger/vänster


            int step = 0;
            do {
                check(a);
                if (x != 0 && x != 7 && y == 7) {       // om myran är i kanten till höger men inte i ytterkanterna
                    int walk = rand.nextInt(3);
                    if (walk == 0) {
                        y = y - 1;
                    } else if (walk == 1) {
                        x = x - 1;
                    } else if (walk == 2) {
                        x = x + 1;
                    }
                    step++;
                    a[x][y] = 1;
                } else if (x != 0 && x != 7 && y == 0) {// om myran är längst ut till vänster men inte i ytterkanterna
                    int walk = rand.nextInt(3);
                    if (walk == 0) {
                        y = y + 1;
                    } else if (walk == 1) {
                        x = x + 1;
                    } else if (walk == 2) {
                        x = x - 1;
                    }
                    step++;
                    a[x][y] = 1;
                } else if (y != 0 && y != 7 && x == 7) {         // om myran är längst ner i kanten men inte i ytterkanterna
                    int walk = rand.nextInt(3);
                    if (walk == 0) {
                        x = x - 1;
                    } else if (walk == 1) {
                        y = y + 1;
                    } else if (walk == 2) {
                        y = y - 1;
                    }
                    step++;
                    a[x][y] = 1;
                } else if (y != 0 && y != 7 && x == 0) { // om myran är längst ner i kanten men inte i ytterkanterna
                    int walk = rand.nextInt(3);
                    if (walk == 0) {
                        x = x + 1;
                    } else if (walk == 1) {
                        y = y - 1;
                    } else if (walk == 2) {
                        y = y + 1;
                    }
                    step++;
                    a[x][y] = 1;
                } else if (x == 0 && y == 0) {// om myran är i vänster uppe, ytterhörn
                    int walk = rand.nextInt(2);
                    if (walk == 0) {
                        x = x + 1;
                    } else if (walk == 1) {
                        y = y + 1;
                    }
                    a[x][y] = 1;
                    step++;
                }
                if (y == 7 && x == 0) {          // om myran är i höger uppe, ytterhörn
                    int walk = rand.nextInt(2);
                    if (walk == 0) {
                        x = x + 1;
                    } else if (walk == 1) {
                        y = y - 1;
                    }
                    step++;
                    a[x][y] = 1;
                } else if (x == 7 && y == 7) {          // om myran är i nedre höger hörn.
                    int walk = rand.nextInt(2);
                    if (walk == 0) {
                        x = x - 1;
                    } else if (walk == 1) {
                        y = y - 1;
                    }
                    step++;
                    a[x][y] = 1;
                }
                if (y == 0 && x == 7) {              // om myran är i nedre vänstra hörn
                    int walk = rand.nextInt(2);
                    if (walk == 0) {
                        y = y + 1;
                    } else if (walk == 1) {
                        x = x - 1;
                    }
                    step++;
                    a[x][y] = 1;
                }
                if (x < 7 && x > 0 && y > 0 && y < 7) { // om myran är överallt annat
                    int walk = rand.nextInt(5);
                    if (walk == 1) {
                        x++;
                    } else if (walk == 2) {
                        y++;
                    } else if (walk == 3) {
                        x--;
                    } else if (walk == 4) {
                        y--;
                    }
                    step++;
                    a[x][y] = 1;
                }
            } while (!check(a));
            sum = sum + step;
            System.out.println("Antal steg i stimulering: " + k + ": " + step);
        } float medelvarde = sum /10;
        System.out.println("Antal steg i medel: " + medelvarde );
    }

    public static boolean check(int[][] a) {        // kollar igenom arrayen
        for (int i = 0; i < 8; i++) {               // när alla värden är 1
            for (int j = 0; j < 8; j++) {           // return true.
                int c = a[i][j];                    // loopen stannar.
                if (c == 0) {
                    return false;
                }
                }
            } return true;
        }
    }