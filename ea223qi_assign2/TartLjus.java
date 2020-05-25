package ea223qi_assign2;

public class TartLjus {
    public static void main(String[] args) {
        int lights = 0;
        int birthd = 0;
        int ask = 0;
        int box = 0;

        for (int i = 1; i < 101; i++) { // loopar 100 gånger
            birthd = birthd + 1;
            lights = lights - birthd; // ljus som är kvar

            if (lights < 0) {

                while (lights < 0) { // loopar tills ljus är fler än 0
                    ask++;              //totalt askar vi köper
                    lights = lights + 24; // vi lägger till de 24a ljusen som använts
                    box++;          // antalet boxar vi köper

                }
                System.out.println("Före födelsedag " + birthd +
                                    ", köp " + box + " ask(ar)");
                box = 0;        // återstället boxarna så vi inte har kvar
            }                   // från den förra

        }   System.out.println("Totalt antal askar: " + ask +
                ", återstående ljus: " + lights);
    }
}
